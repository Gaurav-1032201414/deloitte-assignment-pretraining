package gaurav.javacore.lab6.exp3;

import java.util.*;

public class ExerciseThree {
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        for (int number : numbers) {
            squaresMap.put(number, number * number);
        }
        return squaresMap;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Squares: " + getSquares(numbers));
    }
}

