package gaurav.javacore.lab6.exp1;

import java.util.*;

public class ExerciseOne {
    public static List<Integer> getValues(HashMap<String, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        return values;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 3);
        map.put("C", 8);
        System.out.println("Sorted Values: " + getValues(map));
    }
}

