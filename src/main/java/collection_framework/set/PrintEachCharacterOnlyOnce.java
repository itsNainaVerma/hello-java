//print each character only once in the 'same sequence' using hashSet
// input - missiSsIpPi  o/p - misp

package collection_framework.set;

import java.util.*;
import java.lang.*;


public class PrintEachCharacterOnlyOnce {
    public static void main(String[] args){
        String s = "missiSsIpPi".toLowerCase();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for(char c: s.toCharArray()){
            if(set.add(c)){   //so the sequence is maintained
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
