package gaurav.javacore.lab6.exp2;

import java.util.*;

public class ExerciseTwo {
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : arr) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        System.out.println("Character Count: " + countChars(arr));
    }
}

