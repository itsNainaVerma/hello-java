package exception_handling.try_catch_finally;

public class Program3 {

    public static void main(String[] args) {

        try {
            int[] a = new int[2];

            System.out.println(a[1]);

            System.out.println("Hi");
        } catch(Exception e) {
            System.out.println("Inside Exception catch block : " + e);
        }
        finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Hello");
    }
}
