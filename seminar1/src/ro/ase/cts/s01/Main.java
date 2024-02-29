package ro.ase.cts.s01;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.addition();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}



