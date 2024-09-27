package gaurav.javacore.lab2.exp4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class ExerciseFour {
    public static int[] modifyArray(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }

        Arrays.sort(uniqueArr);
        int[] result = new int[uniqueArr.length];
        for (int i = 0; i < uniqueArr.length; i++) {
            result[i] = uniqueArr[uniqueArr.length - 1 - i];
        }
        return result;
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

        int[] result = modifyArray(arr);
        System.out.println("Array after removing duplicates and sorting in descending order: " + Arrays.toString(result));
        sc.close();
    }
}

