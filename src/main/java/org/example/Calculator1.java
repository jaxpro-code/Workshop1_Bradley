package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        //the principle, interest rate, loan length
        // m = p(r((1+r)^n)) / ((1+r)^n) - 1
        // (m *n) - p
        // output monthly payment and total interest
        Scanner info = new Scanner(System.in);
        System.out.println("what is your principle?");
        double pirn = info.nextDouble();

        System.out.println("whats you interest rate?");
        double rate = info.nextDouble();
        double r = (rate/ 12)/100;

        System.out.println("whats your loan length?");
        double length = info.nextDouble();
        double n = length*12;

        double M = pirn * (r * (Math.pow((1+r),n)) / (Math.pow(1+r,n) - 1));

        System.out.println(M);




        double test = info.nextDouble();




    }

    }



