package gaurav.javacore.lab3.exp5;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text (use multiple lines and press Enter when done):");

        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            text.append(line).append("\n");
        }

        String[] lines = text.toString().split("\n");
        String[] words = text.toString().split("\\s+");

        System.out.println("Number of characters: " + text.length());
        System.out.println("Number of lines: " + lines.length);
        System.out.println("Number of words: " + words.length);
        sc.close();
    }
}

