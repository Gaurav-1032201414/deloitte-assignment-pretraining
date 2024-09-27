package gaurav.javacore.lab6.exp4;

import java.util.*;

public class ExerciseFour {
    public static HashMap<String, String> getStudents(HashMap<String, Integer> marksMap) {
        HashMap<String, String> medalMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            String regNo = entry.getKey();
            int marks = entry.getValue();
            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            }
        }
        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Student1", 95);
        marksMap.put("Student2", 85);
        marksMap.put("Student3", 75);
        System.out.println("Medal Winners: " + getStudents(marksMap));
    }
}

