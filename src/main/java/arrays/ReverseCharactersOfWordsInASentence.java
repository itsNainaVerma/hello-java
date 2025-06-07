package arrays;//Write java program to reverse the characters in the words in given a sentence

public class ReverseCharactersOfWordsInASentence {
    public static void main(String[] args) {
        String s = "Hello my name is Naina";
        String[] w = s.split(" ");
        String res = "";

        for (int i = 0; i < w.length; i++) {
            res = res + reverseString(w[i]);
            if (i != w.length - 1) {
                res = res + " ";
            }
        }
        System.out.println(res);
    }

    public static String reverseString(String input) {
        String temp = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            temp = temp + input.charAt(i);
        }
        return temp;
    }
}
