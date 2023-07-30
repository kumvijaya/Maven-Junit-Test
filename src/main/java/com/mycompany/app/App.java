package com.mycompany.app;
import java.lang.Thread;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() throws Exception {
         Thread.sleep(5000);
        return MESSAGE;
    }
}
