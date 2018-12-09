package bg.sirma.team.longest.period;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {

    public static List<Employee> createListOfEmployees(String filePath) throws IOException {

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while (line != null) {
                employees.add(createEmployee(line));
                line = reader.readLine();
            }
        }
        return employees;
    }

    private static Employee createEmployee(String employeeData) {
        String[] parts = employeeData.split(",");
        int currentEmpID = Integer.parseInt(parts[0]);
        int currentProjectID = Integer.parseInt(parts[1]);
        WorkDate currentDateFrom = new WorkDate(parts[2]);
        WorkDate currentDateTo = new WorkDate(parts[3]);
        long currentWorkingPeriod = WorkDate.getTotalDays(currentDateFrom, currentDateTo);

        return new Employee(currentEmpID, currentProjectID, currentDateFrom, currentDateTo, currentWorkingPeriod);
    }
}
