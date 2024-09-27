package gaurav.javacore.lab3.exp4;

import java.util.Scanner;

public class ExerciseFour {
    public static int modifyNumber(int number1) {
        String str = String.valueOf(number1);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length() - 1; i++) {
            int diff = Math.abs(str.charAt(i) - str.charAt(i + 1));
            sb.append(diff);
        }
        sb.append(str.charAt(str.length() - 1));  // Append the last digit
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        System.out.println("Modified number: " + modifyNumber(number));
        sc.close();
    }
}

