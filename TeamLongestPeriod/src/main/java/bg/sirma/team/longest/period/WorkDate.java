package bg.sirma.team.longest.period;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkDate {

    private int year;
    private int month;
    private int day;

    public WorkDate(String dateFormat) {
        initializeNewWorkDate(dateFormat);
    }

    private void initializeNewWorkDate(String dateFormat) {
        if (!isToday(dateFormat)) {
            String[] parts = dateFormat.split("-");
            this.year = Integer.parseInt(parts[0]);
            this.month = Integer.parseInt(parts[1]);
            this.day = Integer.parseInt(parts[2]);
        } else {
            this.year = 0;
            this.month = 0;
            this.day = 0;
        }
    }

    public static long getTotalDays(WorkDate dateFrom, WorkDate dateTo) {

        Calendar workDateFrom = new GregorianCalendar(dateFrom.getYear(), dateFrom.getMonth(), dateFrom.getDay());

        Calendar workDateTo;

        if (isWorkDateToday(dateTo)) {
            workDateTo = Calendar.getInstance();
        } else {
            workDateTo = new GregorianCalendar(dateTo.getYear(), dateTo.getMonth(), dateTo.getDay());
        }

        long totalDays = (workDateTo.getTimeInMillis() - workDateFrom.getTimeInMillis()) / (1000 * 60 * 60 * 24);
        return totalDays;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    protected boolean isToday(String dateFormat) {
        return dateFormat.equals("NULL");
    }

    protected static boolean isWorkDateToday(WorkDate dateTo) {
        return dateTo.getYear() == 0 && dateTo.getMonth() == 0 && dateTo.getDay() == 0;
    }
}
