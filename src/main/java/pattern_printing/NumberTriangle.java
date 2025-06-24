package pattern_printing;

public class NumberTriangle {
    public static void main(String[] args) {

        int count = 5;

        for(int i = 1; i <= 6; i++) {

            for(int k = 1; k <= count; k++) {
                System.out.print(" ");
            }


            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

            count--;
        }
    }
}
