package collection_framework.map;/*
I/P- AABBBCCCCaaaaa
O/P- A2B3C4a5
*/

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "AABBBCCCCaaaaa";
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ')
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : freqMap.keySet()) {
            System.out.print(c+""+ freqMap.get(c));
        }

        //System.out.print(freqMap);
    }
}