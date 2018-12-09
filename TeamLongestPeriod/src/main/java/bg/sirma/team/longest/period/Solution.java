package bg.sirma.team.longest.period;

import java.io.IOException;
import java.util.List;

public class Solution {
    private List<Employee> employees;
    private int firstEmpID;
    private int secondEmpID;

    public Solution(String filePath) {

        try {
            employees = EmployeeReader.createListOfEmployees(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("There is an error reading the file");
        }

    }

    public void findTeamLongestPeriod() {
        long longestPeriod = 0;

        for (Employee first_employee : employees) {
            for (Employee second_employee : employees) {
                long currentPeriod = 0;
                
                if (first_employee.getProjectID() == second_employee.getProjectID()
                        && first_employee.getEmpID() != second_employee.getEmpID()) {
                    currentPeriod = first_employee.getWorkingPeriod() + second_employee.getWorkingPeriod();
                }
                
                if (currentPeriod > longestPeriod) {
                    firstEmpID = first_employee.getEmpID();
                    secondEmpID = second_employee.getEmpID();
                }
            }
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getFirstEmpID() {
        return firstEmpID;
    }

    public void setFirstEmpID(int firstEmpID) {
        this.firstEmpID = firstEmpID;
    }

    public int getSecondEmpID() {
        return secondEmpID;
    }

    public void setSecondEmpID(int secondEmpID) {
        this.secondEmpID = secondEmpID;
    }

    @Override
    public String toString() {
        return "FirstEmpID=" + firstEmpID + ", SecondEmpID=" + secondEmpID;
    }

}
