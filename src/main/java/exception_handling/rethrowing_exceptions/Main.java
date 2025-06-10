package exception_handling.rethrowing_exceptions;

public class Main {

    public static void main(String[] args) {

        try {
            A a = new A();

            a.func();

            System.out.println("Hi");
        } catch(InterruptedException e) {
            System.out.println("Inside catch block of main method");
        }

        System.out.println("Hello");
    }
}
