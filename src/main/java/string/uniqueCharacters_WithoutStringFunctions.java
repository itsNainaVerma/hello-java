package string;

public class uniqueCharacters_WithoutStringFunctions {
    public static void main(String[] args) {

        String n = "Selenium";

        //without string function
        for (int i = 0; i < n.length(); i++) {
            int m = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(i) == n.charAt(j) && i != j){
                    m = 1;
                    break;
                }
            }
            if (m == 0) {
                System.out.println(n.charAt(i));
            }
        }

    }
}