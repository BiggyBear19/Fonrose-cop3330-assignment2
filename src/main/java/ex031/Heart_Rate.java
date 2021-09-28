/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex031;

import java.util.Scanner;

public class Heart_Rate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Karvonen BPM = new Karvonen();

        System.out.println("Please enter in your age: ");
        String age = input.nextLine();

        System.out.println("Please enter in your resting heart rate: ");
        String resting_rate = input.nextLine();

        BPM.Karvonen_Test(age, resting_rate);




    }
}

