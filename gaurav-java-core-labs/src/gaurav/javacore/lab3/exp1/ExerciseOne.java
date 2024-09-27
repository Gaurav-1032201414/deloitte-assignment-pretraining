package gaurav.javacore.lab3.exp1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of integers separated by spaces:");
        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;

        System.out.println("The integers are:");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}

