package exception_handling.try_catch_finally;

public class Program5_Try_Finally {

    public static void main(String[] args) {

        try {
            int[] a = new int[2];

            System.out.println(a[100]);

            System.out.println("Hi");
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Hello");
    }
}
