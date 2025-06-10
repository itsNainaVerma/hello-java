package exception_handling.user_defined_exception;

public class MyException extends Exception {
    private String errorCode;

    public MyException() {

    }

    public MyException(int age, String statusCode, String msg) {
        super(msg);
        this.errorCode = statusCode;
        System.out.println("status code: "+errorCode+"\nAge: "+age+"\n"+msg);
    }
}
