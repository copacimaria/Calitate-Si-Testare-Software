package ro.ase.cts.s01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/*public class Calculator {
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("X:");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("Y:");
        double y = Double.parseDouble(reader.readLine());

        double x5 = x;
        for (int i = 1; i < 5; i++) {
            x5 *= x;
        }

        double y7 = y;
        for (int i = 1; i < 7; i++) {
            y7 *= y;
        }

        result = x5 + y7;
        return result;
    }
}*/


public class Calculator {
    public static final int x_power = 5;
    public static final int y_power = 7;

    public double raisePower(int power, double value) {
        double newValue = 1.0;
        for (int i = 1; i <= power; i++) {
            newValue *= value;
        }
        return newValue;
    }

    public double addValues(double value1, double value2) {
        return value1 + value2;
    }

    public double addition() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("X:");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("Y:");
        double y = Double.parseDouble(reader.readLine());

        double x5 = raisePower(x_power, x);
        double y7 = raisePower(y_power, y);

        return addValues(x5, y7);
    }
}