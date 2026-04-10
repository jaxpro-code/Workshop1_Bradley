package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        //  the monthly payout, interest rate, years to pay out from the user
        // pv = pmt * ((1-(1+r)^(-n)) / r)
        // output present vaule of the annunity
        Scanner  info = new Scanner(System.in);
        System.out.println("What monthly payout do you want?");
        double PMT = info.nextDouble();

        System.out.println("What is your expected interest rate?");
        double intrest = info.nextDouble();
        double r = (intrest/12)/100;

        System.out.println("How many years do you want to be payed out?");
        double pmt = info.nextDouble();
        double pay = (pmt * -12);

        // pv = pmt * ((1-(1+r)^(-n)) / r)
        double pv = PMT * ((1-(Math.pow(1+r,pay)))/r);

        System.out.println("The present value $" + pv );


    }
}
