package gaurav.javacore.lab3.exp3;

import java.util.Scanner;

public class ExerciseThree {
    public static String alterString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!"AEIOUaeiou".contains(String.valueOf(ch))) {
                if (ch == 'z') {
                    result.append('a');
                } else if (ch == 'Z') {
                    result.append('A');
                } else {
                    result.append((char) (ch + 1));
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Modified string: " + alterString(input));
        sc.close();
    }
}

