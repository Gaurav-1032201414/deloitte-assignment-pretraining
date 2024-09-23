//Lab 1: Flow Control/Operators/Assignments
//Exercise 3: Fibonacci Sequence

package gaurav.javacore.lab1.exp3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class labOneExampleThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the number of terms of the Series: ");
            int num = input.nextInt();
            Fibonacci obj = new Fibonacci();
            obj.printSeries(num);  // Call the method to print the series
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            input.close(); // Close the scanner to avoid resource leaks
        }
    }
}

class Fibonacci {

    public void printSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}