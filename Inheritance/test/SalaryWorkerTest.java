import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker w1, w2;

    @BeforeEach
    void setUp() {
        w1 = new SalaryWorker("000001", "Tom", "Wulf", "Prof.",1958, 0, 60365);
        w2 = new SalaryWorker("000002", "John", "Dinkle", 1985, 0, 97000.67);
    }

    @Test
    void setAnnualSalary() {
        w1.setAnnualSalary(2.20);
        assertEquals(2.20, w1.getAnnualSalary());
        w2.setAnnualSalary(112000);
        assertEquals(112000, w2.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        double w1WeeklyPay = w1.getAnnualSalary() / 52;
        double w2WeeklyPay = w2.getAnnualSalary() / 52;

        assertEquals(w1WeeklyPay, w1.calculateWeeklyPay(0));
        assertEquals(w2WeeklyPay, w2.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Total Weekly Pay: $" + w1.calculateWeeklyPay(0) + "\nTotal Annual Salary: $" + w1.getAnnualSalary(), w1.displayWeeklyPay(0));
        assertEquals("Total Weekly Pay: $" + w2.calculateWeeklyPay(0) + "\nTotal Annual Salary: $" + w2.getAnnualSalary(), w2.displayWeeklyPay(0));
    }
}