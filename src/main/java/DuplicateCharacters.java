// Print duplicate characters using String functions
public class DuplicateCharacters {
        public static void main(String[] args) {
            String n = "selenium";

            int firstIndex, lastIndex;

            for(int i=0; i<n.length(); i++)
            {
                firstIndex = n.indexOf(n.charAt(i));
                lastIndex = n.lastIndexOf(n.charAt(i));
                if(firstIndex!=lastIndex){
                    System.out.print(n.charAt(i));
                    break;
                }

            }
        }
}
