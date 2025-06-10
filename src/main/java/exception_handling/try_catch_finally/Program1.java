package exception_handling.try_catch_finally;

public class Program1 {

    public static void main(String[] args) {

        try {
            int[] a = new int[2];

            System.out.println(a[100]);

            System.out.println("Hi");
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Inside ArrayIndexOutOfBoundsException catch block : " + ae);
        } catch(Exception e) {
            System.out.println("Inside general catch block : " + e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Hello");
    }
}
