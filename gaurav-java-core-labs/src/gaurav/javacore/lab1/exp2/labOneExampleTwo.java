//Lab 1: Flow Control/Operators/Assignments
//Exercise 2: Traffic Light Simulation

package gaurav.javacore.lab1.exp2;

import java.util.Scanner;

public class labOneExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Traffic Light: 1. Red 2. Yellow 3. Green");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
