package gaurav.javacore.lab6.exp6;

import java.util.*;

public class ExerciseSix {
    public static List<String> votersList(Map<String, Integer> idAgeMap) {
        List<String> eligibleVoters = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : idAgeMap.entrySet()) {
            if (entry.getValue() > 18) {
                eligibleVoters.add(entry.getKey());
            }
        }
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, Integer> idAgeMap = new HashMap<>();
        idAgeMap.put("ID1", 20);
        idAgeMap.put("ID2", 16);
        idAgeMap.put("ID3", 19);
        System.out.println("Eligible Voters: " + votersList(idAgeMap));
    }
}

