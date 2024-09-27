package gaurav.javacore.lab2.exp3;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {
    public static int[] getSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String reversed = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            arr[i] = Integer.parseInt(reversed);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = getSorted(arr);
        System.out.println("Sorted array after reversing numbers: " + Arrays.toString(result));
        sc.close();
    }
}
