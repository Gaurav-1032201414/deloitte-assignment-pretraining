package gaurav.javacore.lab3.exp2;

import java.util.Scanner;

public class ExerciseTwo {
    public static String getImage(String str) {
        StringBuffer sb = new StringBuffer(str);
        String mirrorImage = sb.reverse().toString();
        return str + "|" + mirrorImage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Mirror image: " + getImage(input));
        sc.close();
    }
}
