public class SalaryWorker extends Worker {
    double annualSalary = 0;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String ID, String firstName, String lastName, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override public String displayWeeklyPay(double hoursWorked) {
        return "Total Weekly Pay: $" + calculateWeeklyPay(hoursWorked) + "\nTotal Annual Salary: $" + annualSalary;
    }
}
