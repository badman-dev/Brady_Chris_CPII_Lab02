import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Tom", "Wulf", "Prof.",1958, 20);
        w2 = new Worker("000002", "John", "Dinkle", 1985, 12);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(99);
        assertEquals(99, w1.getHourlyPayRate());
        w2.setHourlyPayRate(5.53);
        assertEquals(5.53, w2.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        double w1HoursWorked = 38.5;
        double w1RegularHours = 0;
        double w1OvertimeHours = 0;
        if (w1HoursWorked > 40) {
            w1RegularHours = 40;
            w1OvertimeHours = w1HoursWorked - 40;
        }
        else {
            w1RegularHours = w1HoursWorked;
        }
        double w1WeeklyPay = w1.getHourlyPayRate() * (w1RegularHours + (1.5 * w1OvertimeHours));

        double w2HoursWorked = 55;
        double w2RegularHours = 0;
        double w2OvertimeHours = 0;
        if (w2HoursWorked > 40) {
            w2RegularHours = 40;
            w2OvertimeHours = w2HoursWorked - 40;
        }
        else {
            w2RegularHours = w2HoursWorked;
        }
        double w2WeeklyPay = w2.getHourlyPayRate() * (w2RegularHours + (1.5 * w2OvertimeHours));

        assertEquals(w1WeeklyPay, w1.calculateWeeklyPay(w1HoursWorked));
        assertEquals(w2WeeklyPay, w2.calculateWeeklyPay(w2HoursWorked));
    }

    @Test
    void displayWeeklyPay() {
        double w1HoursWorked = 38.5;
        double w1RegularHours = 0;
        double w1OvertimeHours = 0;
        if (w1HoursWorked > 40) {
            w1RegularHours = 40;
            w1OvertimeHours = w1HoursWorked - 40;
        }
        else {
            w1RegularHours = w1HoursWorked;
        }
        double w1WeeklyPay = w1.getHourlyPayRate() * (w1RegularHours + (1.5 * w1OvertimeHours));

        double w2HoursWorked = 55;
        double w2RegularHours = 0;
        double w2OvertimeHours = 0;
        if (w2HoursWorked > 40) {
            w2RegularHours = 40;
            w2OvertimeHours = w2HoursWorked - 40;
        }
        else {
            w2RegularHours = w2HoursWorked;
        }
        double w2WeeklyPay = w2.getHourlyPayRate() * (w2RegularHours + (1.5 * w2OvertimeHours));

        assertEquals("Regular Pay: " + w1RegularHours + " hours, totalling $" + (w1RegularHours * w1.getHourlyPayRate()) +
                "\nOvertime Pay: " + w1OvertimeHours + " hours, totalling $" + (w1OvertimeHours * w1.getHourlyPayRate() * 1.5) +
                "\nTotal Weekly Pay: " + w1HoursWorked + " hours, totalling $" + w1.calculateWeeklyPay(w1HoursWorked),
                w1.displayWeeklyPay(w1HoursWorked));
        assertEquals("Regular Pay: " + w2RegularHours + " hours, totalling $" + (w2RegularHours * w2.getHourlyPayRate()) +
                        "\nOvertime Pay: " + w2OvertimeHours + " hours, totalling $" + (w2OvertimeHours * w2.getHourlyPayRate() * 1.5) +
                        "\nTotal Weekly Pay: " + w2HoursWorked + " hours, totalling $" + w2.calculateWeeklyPay(w2HoursWorked),
                w2.displayWeeklyPay(w2HoursWorked));
    }
}