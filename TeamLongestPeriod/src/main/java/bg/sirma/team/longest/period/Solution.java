package bg.sirma.team.longest.period;

import java.io.IOException;
import java.util.List;

public class Solution {
    private List<Employee> employees;
    private int firstEmpID;
    private int secondEmpID;

    public Solution(String filePath) {
        this.employees = initializeListOfEmployees(filePath);
        this.firstEmpID = 0;
        this.secondEmpID = 0;
    }

    public void findTeamLongestPeriod() {
        long longestPeriod = 0;

        for (Employee firstEmployee : employees) {
            for (Employee secondEmployee : employees) {
                long currentPeriod = 0;

                if (isProjectIDSame(firstEmployee, secondEmployee)) {
                    currentPeriod = firstEmployee.getWorkingPeriod() + secondEmployee.getWorkingPeriod();
                }

                if (currentPeriod > longestPeriod) {
                    firstEmpID = firstEmployee.getEmpID();
                    secondEmpID = secondEmployee.getEmpID();
                }
            }
        }
    }

    private boolean isProjectIDSame(Employee firstEmployee, Employee secondEmployee) {
        return firstEmployee.getProjectID() == secondEmployee.getProjectID()
                && firstEmployee.getEmpID() != secondEmployee.getEmpID();
    }

    private List<Employee> initializeListOfEmployees(String filePath) {
        List<Employee> newEmployees;
        try {
            newEmployees = EmployeeReader.createListOfEmployees(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("There is an error reading the file");
        }
        return newEmployees;

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
