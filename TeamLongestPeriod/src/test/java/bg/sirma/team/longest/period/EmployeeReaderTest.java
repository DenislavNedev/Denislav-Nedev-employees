package bg.sirma.team.longest.period;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class EmployeeReaderTest {
    
    @Test
    public void  test_is_list_of_employees_created_from_file(){
        List<Employee> employees;
        try {
            employees=EmployeeReader.createListOfEmployees("./src/test/resources/test.txt");
        } catch (IOException e) {
            employees=new ArrayList<>();
            e.printStackTrace();
        }
        assertNotNull(employees);
    }
    
    @Test
    public void test_is_employee_created() {

        Employee employee = createNewEmployee("143,12,2013-11-01,2014-01-05");
        assertNotNull(employee);
    }
  
    private static Employee createNewEmployee(String invoiceData) {
        String[] parts = invoiceData.split(",");
        int currentEmpID = Integer.parseInt(parts[0]);
        int currentProjectID = Integer.parseInt(parts[1]);
        WorkDate currentDateFrom = new WorkDate(parts[2]);
        WorkDate currentDateTo = new WorkDate(parts[3]);
        long currentWorkingPeriod = WorkDate.getTotalDays(currentDateFrom, currentDateTo);
        
        return new Employee(currentEmpID, currentProjectID, currentDateFrom, currentDateTo,currentWorkingPeriod); 
    }

}
