package gaurav.javacore.lab2.exp2;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwo {
    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        int mid = (arr.length % 2 == 0) ? arr.length / 2 : (arr.length / 2) + 1;

        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }
        for (int i = mid; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String[] result = sortStrings(arr);
        System.out.println("Modified sorted array: " + Arrays.toString(result));
        sc.close();
    }
}

