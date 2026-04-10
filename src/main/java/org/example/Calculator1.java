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

        double ir = (M * n) - pirn;

        System.out.println("Your monthly payment is " + M + " and you total interest is " + ir + "." );










    }

    }



