//Extract number from string and store in a list and check for the duplicates

package collection_framework.list;

import java.util.*;

public class duplicateNumbersInString {
    public static void main(String[] args) {

        String n = "selenium1232453";
        List<Character> strNum = new ArrayList<>();
        int firstIndex;
        int lastIndex;
        int count=0;

        for(int i=0; i<n.length(); i++)
        {
            if(n.charAt(i)>=48 && n.charAt(i)<=57)
            {
                strNum.add(n.charAt(i));
            }
        }
        System.out.println(strNum+"\n");
        for(char c: strNum){
            firstIndex = strNum.indexOf(c);
            lastIndex = strNum.lastIndexOf(c);
            if(firstIndex!=lastIndex){
                count++;
            }
        }
        System.out.println("There are " + count/2 + " duplicate numbers available");
    }
}
