//Write java program to reverse the words in given sentence

package string;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Hello. My name is Naina";

        String[] w = s.split("\\.");

        for(String word : w) {
            String res[] = word.split(" ");
            String Temp="";
            for(int i = res.length-1 ; i >=0; i--)
            {
                if(i!=0){
                    Temp = Temp + " ";
                }
                Temp = Temp + res[i];
            }
            Temp = Temp + ". ";
            System.out.print(Temp);
        }
    }
}
