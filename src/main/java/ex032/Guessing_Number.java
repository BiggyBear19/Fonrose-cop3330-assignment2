/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex032;

import java.util.Scanner;

public class Guessing_Number {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        Game gaming = new Game();

        System.out.println("Let's Play Guess the Number");

        System.out.print("Enter a difficulty level (1, 2, or 3): ");
        String diff_lvl = guess.nextLine();

        gaming.Guessing_Game(diff_lvl);
    }
}
