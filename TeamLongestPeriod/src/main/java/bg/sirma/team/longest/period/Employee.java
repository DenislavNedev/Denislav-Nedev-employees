package bg.sirma.team.longest.period;

public class Employee {

    private int empID;
    private int projectID;
    private WorkDate dateFrom;
    private WorkDate dateTo;
    private long workingPeriod;

    public Employee(int empID, int projectID, WorkDate dateFrom, WorkDate dateTo, long workingPeriod) {
        this.empID = empID;
        this.projectID = projectID;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.workingPeriod = workingPeriod;
    }

    public long getWorkingPeriod() {
        return workingPeriod;
    }

    public int getEmpID() {
        return empID;
    }

    public int getProjectID() {
        return projectID;
    }

    public WorkDate getDateFrom() {
        return dateFrom;
    }

    public WorkDate getDateTo() {
        return dateTo;
    }

    @Override
    public String toString() {
        return "Employee [EmpID=" + empID + ", ProjectID=" + projectID + ", DateFrom=" + dateFrom + ", DateTo=" + dateTo
                + "]";
    }

}
