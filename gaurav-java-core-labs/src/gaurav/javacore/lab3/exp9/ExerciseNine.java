package gaurav.javacore.lab3.exp9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD format:");
        String inputDate = sc.nextLine();

        LocalDate enteredDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(enteredDate, currentDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        sc.close();
    }
}

