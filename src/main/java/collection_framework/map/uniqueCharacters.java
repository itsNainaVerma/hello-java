package collection_framework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class uniqueCharacters {
    public static void main(String[] args) {

        String n = "selenium";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i= 0; i<n.length(); i++) {
            map.put(n.charAt(i), map.getOrDefault(n.charAt(i), 0) + 1);
        }
        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}





