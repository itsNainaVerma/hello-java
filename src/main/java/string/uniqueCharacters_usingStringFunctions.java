package string;

public class uniqueCharacters_usingStringFunctions {
    public static void main(String[] args) {

        String n = "Selenium";
        int firstIndex;
        int lastIndex;

        for (int i = 0; i < n.length(); i++) {
            firstIndex = n.indexOf(n.charAt(i));
            lastIndex = n.lastIndexOf(n.charAt(i));

            if (firstIndex == lastIndex) {
                System.out.println(n.charAt(i));

            }
        }

    }
}