package exception_handling.throw_throws;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A {

    void func() throws IOException {
        System.out.println("Inside func() method");
        throw new IOException();
    }

    void func2() throws IOException, ParseException {
        // Below code throws IOException.
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        System.out.println("File line: " + reader.readLine());
        reader.close();

        // Below code throws ParseException.
        String dateStr = "2025-13-01"; // Invalid month
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
    }


    void func3(int i) throws IOException, InterruptedException, ClassNotFoundException {
        if(i == 1) {
            throw new IOException();
        }

        if(i == 2) {
            throw new InterruptedException();
        }

        if(i == 3) {
            throw new ClassNotFoundException();
        }
    }

    // for unchecked exceptions we do not need to use try catch or throws keyword, if we explicitly use throw keyword.
    // this is only for unchecked exceptions. so fun4(), fun5() and func6() both are correct
    void func4(int i) {
        if(i == 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if(i == 2) {
            throw new ArithmeticException();
        }

        if(i == 3) {
            throw new NullPointerException();
        }
    }


    void func5() {
        try {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }

            System.out.println("Access granted - You are old enough.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // for unchecked exceptions we do not need to use try catch or throws keyword, if we explicitly use throw keyword.
    // this is only for unchecked exceptions. so fun4(), fun5() and func6() both are correct
    void func6() {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }
            System.out.println("Access granted - You are old enough.");

    }

    void func7() {
        try {
            int age = 15;

            if (age < 18) {
                throw new IOException("Access denied - You must be at least 18 years old.");
            }

            System.out.println("Access granted - You are old enough.");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
