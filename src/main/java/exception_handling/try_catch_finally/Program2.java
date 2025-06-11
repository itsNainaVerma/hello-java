package exception_handling.try_catch_finally;

public class Program2 {

    public static void main(String[] args) {

        try {
            int[] a = new int[2];

            System.out.println(a[10]);

            System.out.println("Hi");
        } catch(StringIndexOutOfBoundsException se) {
            System.out.println("Inside StringIndexOutOfBoundsException catch block : " + se);
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Hello");
    }
}
