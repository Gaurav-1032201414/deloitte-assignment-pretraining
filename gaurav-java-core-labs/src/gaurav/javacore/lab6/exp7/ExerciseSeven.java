package gaurav.javacore.lab6.exp7;

import java.util.*;

public class ExerciseSeven {
    public static int[] getSorted(int[] arr) {
        // Reverse the array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        Arrays.sort(reversed);
        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        System.out.println("Sorted after reversing: " + Arrays.toString(getSorted(arr)));
    }
}

