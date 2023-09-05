public class Worker extends Person{
    private double hourlyPayRate = 0;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String ID, String firstName, String lastName, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    //test

    public double calculateWeeklyPay(double hoursWorked) {
        double regularHoursWorked = calculateRegularHours(hoursWorked);
        double overtimedHoursWorked = calculateOvertimeHours(hoursWorked);

        return hourlyPayRate * (regularHoursWorked + (overtimedHoursWorked * 1.5));
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularHoursWorked = calculateRegularHours(hoursWorked);
        double overtimedHoursWorked = calculateOvertimeHours(hoursWorked);
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        return "Regular Pay: " + regularHoursWorked + " hours, totalling $" + (regularHoursWorked * hourlyPayRate) +
                "\nOvertime Pay: " + overtimedHoursWorked + " hours, totalling $" + (overtimedHoursWorked * hourlyPayRate * 1.5) +
                "\nTotal Weekly Pay: " + hoursWorked + " hours, totalling $" + weeklyPay;
    }

    private double calculateRegularHours(double hoursWorked) {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    private double calculateOvertimeHours(double hoursWorked) {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }
}
