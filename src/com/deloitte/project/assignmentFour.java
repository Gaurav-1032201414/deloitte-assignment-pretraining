// Assignment 4: Strings and StringBuilder

package com.deloitte.project;

import java.util.Scanner;

public class assignmentFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        StringBuilder stringbuilder = new StringBuilder(sentence);
        String reverseSentence = stringbuilder.reverse().toString();

        System.out.println(reverseSentence);

        sc.close();

        boolean result1 = sentence.equals(reverseSentence);
        System.out.println(result1);

        boolean result2 = sentence.equalsIgnoreCase(reverseSentence);
        System.out.println(result2);


    }
}

