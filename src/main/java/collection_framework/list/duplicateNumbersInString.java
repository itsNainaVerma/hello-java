//Extract number from string and store in a list and check for the duplicates

package collection_framework.list;

import java.util.*;

public class duplicateNumbersInString {
    public static void main(String[] args) {

        String n = "selenium1234";
        List<Character> strNum = new ArrayList<>();

        for(int i=0; i<n.length(); i++)
        {
            if(n.charAt(i)>=48 && n.charAt(i)<=57)
            {
                strNum.add(n.charAt(i));
            }
        }
        System.out.print(strNum);
    }

    // needs to be completed ...
}
