package pattern_printing;

public class ButterflyStarPattern {
    public static void main(String[] args) {

        int count = 10;

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int k = 1; k <= count; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            count = count - 2;
        }

        count = 0;

        for(int i = 6; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int k = 1; k <= count; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            count = count + 2;
        }
    }
}
