package gaurav.javacore.lab6.exp5;

import java.util.*;

public class ExerciseFive {
    public static int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1]; // Second smallest element
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        System.out.println("Second Smallest: " + getSecondSmallest(arr));
    }
}

