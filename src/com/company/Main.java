package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Earth's gravity in m/s^2
        double Vi = 0.0;
        double Xi = 0.0;
        double t = 10.0;
        double  x;

        x = 0.5* a*(t*t) + (Vi*t) + Xi;

        System.out.println("The object's position after " + t +
                " seconds is " + x + " m.");
    }
}
