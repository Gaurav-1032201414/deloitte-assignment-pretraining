package gaurav.javacore.lab3.exp8;

import java.util.Scanner;

public class ExerciseEight {
    public static boolean isPositiveString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPositiveString(input)) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }
        sc.close();
    }
}

