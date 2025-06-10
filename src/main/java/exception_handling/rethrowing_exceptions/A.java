package exception_handling.rethrowing_exceptions;

public class A {

    void func() throws InterruptedException {

        try {
            System.out.println("Inside func() method");

            throw new InterruptedException();
        } catch(InterruptedException e) {
            System.out.println("Inside catch block of func() method");
            throw e;
        }
    }
}
