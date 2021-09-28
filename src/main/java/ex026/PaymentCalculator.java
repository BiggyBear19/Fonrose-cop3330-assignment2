/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex026;

public class PaymentCalculator {

    double balance;
    double apr;
    double monthly_payment;



    public static double calculateMonthsUntilPaidOff(double balance, double apr, double monthly_payment){

        apr = apr / 100;

        double daily_rate = apr / 365;

        balance = Math.round(balance * 100)/100.0;
        monthly_payment = Math.round(monthly_payment * 100)/100.0;


        double months = -(1.0/30.0) * Math.log(1 + balance / monthly_payment * (1 - Math.pow((1 + daily_rate), 30))) / Math.log(1 + daily_rate);

        months = Math.ceil(months);



        return months;
    }
}
