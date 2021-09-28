/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex026;

import java.util.Scanner;

public class Card_Payment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PaymentCalculator APR_Calc = new PaymentCalculator();

        System.out.print("Please enter in your balance: ");
        double balance = input.nextDouble();

        System.out.print("Please enter in your APR on the card (As a percent): ");
        double APR = input.nextDouble();

        System.out.print("Please enter in your monthly payment: ");
        double monthly_payment = input.nextDouble();


        double my_months = APR_Calc.calculateMonthsUntilPaidOff(balance, APR, monthly_payment);


        System.out.printf("You will pay off this card in %f months", my_months);
    }
}
