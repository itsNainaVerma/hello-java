/*
Extract numbers and print the repeating numbers
*/

import java.util.*;

class ExtractDuplicateNumbers {
    public static void main(String[] args) {
        String input = "abc123xyz45abc123";
        //char[] inputArr = input.toCharArray();
        Map<Character,Integer> dupInt = new HashMap<>();

        for(int i = 0; i<input.length(); i ++){
            if(input.charAt(i)>=48 && input.charAt(i)<=57){
                dupInt.put(input.charAt(i), dupInt.getOrDefault(input.charAt(i),0)+1);
            }
        }

        for(char c : dupInt.keySet()){
            if(dupInt.get(c)>1){
                System.out.println(c);
            }
        }
    }
}