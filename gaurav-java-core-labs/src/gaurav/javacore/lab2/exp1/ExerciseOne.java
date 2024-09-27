package gaurav.javacore.lab2.exp1;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseOne {
    public static int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
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

        System.out.println("Second smallest element: " + getSecondSmallest(arr));
        sc.close();
    }
}
