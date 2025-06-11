package exception_handling.try_catch_finally;

public class Program4 {

    public static void main(String[] args) {
        Program4 obj = new Program4();

        int d = obj.div(16, 2);

        System.out.println(d);

        d = obj.div(16, 0);

        System.out.println(d);
    }
    public int div(int a, int b) {

        int res = 0;

        try {
            res = a / b;
        } catch(Exception e) {
            System.out.println("Inside catch block : " + e);
        } finally {
            System.out.println("Inside finally block");
        }

        return res;
    }
}
