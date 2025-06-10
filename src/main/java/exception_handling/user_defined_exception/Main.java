package exception_handling.user_defined_exception;

public class Main {

    public static void main(String[] args) {

        try {
            //throw new MyException();
            throw new MyException(18,"403","age is less than 20");
        } catch(MyException me) {
            System.out.println("Inside catch block");
        }
    }
}
