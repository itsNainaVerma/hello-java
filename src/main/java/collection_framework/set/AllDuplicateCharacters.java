//print only duplicate characters in the 'same sequence' using hashSet
// input - missiSsIpPi  o/p - misp

package collection_framework.set;

import java.util.HashSet;
import java.util.Set;


public class AllDuplicateCharacters {
    public static void main(String[] args){
        String s = "missiSsIpPi".toLowerCase();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for(char c: s.toCharArray()){
            if(!set.add(c)){   //so the sequence is maintained
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
