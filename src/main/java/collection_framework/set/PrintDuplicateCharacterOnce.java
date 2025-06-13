//print all duplicate characters once in the 'same sequence' using hashSet
// input - missiSsIpPi  o/p - isp

package collection_framework.set;

import java.util.*;
import java.util.Set;


public class PrintDuplicateCharacterOnce {
    public static void main(String[] args){
        String s = "missiSsIpPi".toLowerCase();
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new LinkedHashSet<>();

        for(char c: s.toCharArray()){
            if(!set.add(c)){//so the sequence is maintained
                set2.add(c);
                }
            }
        for(char c: set2) {
            System.out.print(c);
        }
    }
}
