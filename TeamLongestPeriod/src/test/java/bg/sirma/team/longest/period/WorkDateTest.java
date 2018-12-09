package bg.sirma.team.longest.period;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class WorkDateTest {

    @Test
    public void test_creating_date() {
        WorkDate date = new WorkDate("2008-04-11");
        assertNotNull(date);
    }

    @Test
    public void test_get_total_days() {
        WorkDate date1 = new WorkDate("2008-04-10");
        WorkDate date2 = new WorkDate("2008-04-11");
        assertEquals(WorkDate.getTotalDays(date1, date2), 1);
    }

    @Test
    public void test_is_today() {
        WorkDate date = new WorkDate("NULL");
        assertEquals(date.isToday("NULL"), true);
    }

}
