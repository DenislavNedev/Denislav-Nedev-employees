package bg.sirma.team.longest.period;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.junit.Test;

public class EmployeeReaderTest {

    @Test
    public void test_is_list_of_employees_created_from_file() throws IOException {
        assertNotNull(EmployeeReader.createListOfEmployees("./src/test/resources/test.txt"));
    }

}
