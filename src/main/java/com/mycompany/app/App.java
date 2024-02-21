package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins but not today";

    public App() {}

    public static void main(String[] args) {
        System.out.println("THis is a normal change");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
