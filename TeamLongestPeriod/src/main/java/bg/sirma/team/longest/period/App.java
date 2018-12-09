package bg.sirma.team.longest.period;

public class App {

    public static void main(String[] args) {
        Solution currentSolution = new Solution("./src/test/resources/test.txt");
        currentSolution.findTeamLongestPeriod();
        System.out.println(currentSolution);
    }
}
