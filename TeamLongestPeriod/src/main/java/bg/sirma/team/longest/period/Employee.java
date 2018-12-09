package bg.sirma.team.longest.period;

public class Employee {

    private final int EmpID;
    private final int ProjectID;
    private final WorkDate DateFrom;
    private final WorkDate DateTo;
    private final long workingPeriod;

    public Employee(int empID, int projectID, WorkDate dateFrom, WorkDate dateTo, long workingPeriod) {
        this.EmpID = empID;
        this.ProjectID = projectID;
        this.DateFrom = dateFrom;
        this.DateTo = dateTo;
        this.workingPeriod=workingPeriod;
    }

    public long getWorkingPeriod() {
        return workingPeriod;
    }

    public int getEmpID() {
        return EmpID;
    }

    public int getProjectID() {
        return ProjectID;
    }

    public WorkDate getDateFrom() {
        return DateFrom;
    }

    public WorkDate getDateTo() {
        return DateTo;
    }

    @Override
    public String toString() {
        return "Employee [EmpID=" + EmpID + ", ProjectID=" + ProjectID + ", DateFrom=" + DateFrom + ", DateTo=" + DateTo
                + "]";
    }

}
