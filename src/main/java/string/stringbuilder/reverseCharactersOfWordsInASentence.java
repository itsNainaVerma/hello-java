package string.stringbuilder;

//Write java program to reverse the characters of the words in given sentence

public class reverseCharactersOfWordsInASentence {
    public static void main(String[] args) {

        String s = "Hello my name is Naina";
        String[] w = s.split(" ");
        StringBuilder sb,sb1;
        String res = "";

        for(String words : w) {
            sb = new StringBuilder(words);
            res = res + sb.reverse().toString() + ' ';
        }
        System.out.println(res);
    }
}
