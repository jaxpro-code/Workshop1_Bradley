package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
    // the deposit, interest rate, number of years
    // fv = p *(1+(r/365))^(365*t)
    // fv- p
    //output the furture vaule and total interest
        Scanner info = new Scanner(System.in);
        System.out.println("what is your deposit?");
        double P = info.nextDouble();

        System.out.println("what is your interest rate?");
        double rate = info.nextDouble();
        double r = (rate/100);

        System.out.println("How many years is your investment?");
        double t = info.nextDouble();

        double fv = P * Math.pow((1+(r/365)),365*t);




}
}