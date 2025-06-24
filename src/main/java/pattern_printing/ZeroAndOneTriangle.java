
public class ZeroAndOneTriangle {
    public static void main(String[] args) {

        int x;

        for(int i = 1; i <= 6; i++) {

            if(i % 2 == 0) {
                x = 0;
            } else {
                x = 1;
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(x + " ");

                if(x == 0) {
                    x = 1;
                } else {
                    x = 0;
                }
            }

            System.out.println();
        }
    }
}
