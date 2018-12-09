package bg.sirma.team.longest.period;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test_finding_the_team_first_employee() {
        Solution currentSolution = new Solution("./src/test/resources/test.txt");
        currentSolution.findTeamLongestPeriod();
        assertEquals(115, currentSolution.getFirstEmpID());
    }

    @Test
    public void test_finding_the_team_second_employee() {
        Solution currentSolution = new Solution("./src/test/resources/test.txt");
        currentSolution.findTeamLongestPeriod();
        assertEquals(currentSolution.getSecondEmpID(), 143);
    }

}
