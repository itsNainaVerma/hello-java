//Write java program to reverse the words in given sentence

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Hello. My name is Pie";

        String[] w = s.split("\\.");

        for(String word : w) {
            String res[] = word.split(" ");
            String Temp="";
            for(int i = res.length-1 ; i >=0; i--)
            {
                Temp = Temp + res[i];

                if(i!=0){
                    Temp = Temp + " ";
                }
            }
            Temp = Temp + ". ";
            System.out.print(Temp);
        }
    }
}
