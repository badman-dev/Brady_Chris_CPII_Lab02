import java.text.DecimalFormat;
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("000001", "John", "Dinkley", "Mr.", 1996, 12.30));
        workers.add(new Worker("000002", "Abraham", "Lincoln", 1966, 18));
        workers.add(new Worker("000003", "Sara", "Conner", "Ms.", 1982, 16.50));
        workers.add(new SalaryWorker("000004", "Chris", "Brady", 1998, 0, 40250));
        workers.add(new SalaryWorker("000005", "Doug", "Bossman", 1984, 0, 60000));
        workers.add(new SalaryWorker("000006", "Joey", "Gondek", 1999, 0, 112000));

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Weekly Pay for Workers");
        System.out.printf( "%-20s %-15s %-15s %-15s %n", "Worker", "Week 1 (40hr)", "Week 2 (50hr)", "Week 3 (40hr)");
        System.out.println("===================================================================");

        for(Worker worker : workers) {
            System.out.printf( "%-20s %-15s %-15s %-15s %n", worker.fullName(), "$" + df.format(worker.calculateWeeklyPay(40)),
                    "$" + df.format(worker.calculateWeeklyPay(50)), "$" + df.format(worker.calculateWeeklyPay(40)));
        }
    }
}