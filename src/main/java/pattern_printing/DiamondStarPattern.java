package pattern_printing;

public class DiamondStarPattern {
    public static void main(String[] args) {

        int count = 5;

        for(int i = 1; i <= 11; i = i + 2) {
            for(int k = 1; k <= count; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            count--;
        }

        count = 1;

        for(int i = 9; i >= 1; i = i - 2) {
            for(int k = 1; k <= count; k++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            count++;
        }
    }
}
