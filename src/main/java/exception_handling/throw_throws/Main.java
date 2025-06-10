package exception_handling.throw_throws;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        try {
            A a = new A();
            a.func();
        } catch(IOException ie) {
            System.out.println("Inside catch block of main method");
        }

        try {
            A a = new A();
            a.func2();
        } catch (IOException ie) {
            System.out.println("Inside 2nd catch block of main method");
        } catch (ParseException pe) {
            System.out.println("Parse exception thrown in main method");
        }
    }
}
