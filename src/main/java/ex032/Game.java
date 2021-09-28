/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex032;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void Guessing_Game(String difficulty){
        Scanner input = new Scanner(System.in);
        Random rand_num = new Random();
        int max;
        int min;
        int guess;
        int attempt = 1;


        boolean play = true;
        if (difficulty.equals("1")) {
            max = 10;
            min = 1;
            int ten_size_raw = rand_num.nextInt(((max - min) + 1) + min);
            System.out.print("I have my number. What is your guess? ");
            do{
                guess = input.nextInt();
                if(guess == ten_size_raw){
                    System.out.printf("Congrats you guessed the number in %d attempts\n ", attempt);
                    System.out.println("Would you like to play again (1 for yes/ 2 for no)?");
                    int continue_play = input.nextInt();

                    if(continue_play == 1){
                        System.out.print("I have my number. What is your Guess\n");
                    }

                    if(continue_play == 2){
                        play = false;
                    }
                }
                if(guess < ten_size_raw){
                    System.out.print("Sorry your guess is smaller than the right number\n");
                    attempt++;
                }

                if(guess > ten_size_raw){
                    System.out.print("Sorry your guess is bigger than the right number\n");
                    attempt++;
                }
            }
            while(play);
        }

        if (difficulty.equals("2")) {
            max = 100;
            min = 1;
            int hundred_size_raw = rand_num.nextInt(((max - min) + 1) + min);
            System.out.print("I have my number. What is your guess? ");
            do{
                guess = input.nextInt();
                if(guess == hundred_size_raw){
                    System.out.printf("Congrats you guessed the number in %d attempts\n ", attempt);
                    System.out.println("Would you like to play again (1 for yes/ 2 for no)?");
                    int continue_play = input.nextInt();

                    if(continue_play == 1){
                        System.out.print("I have my number. What is your Guess\n");
                    }

                    if(continue_play == 2){
                        play = false;
                    }

                }
                if(guess < hundred_size_raw){
                    System.out.print("Sorry your guess is smaller than the right number\n");
                    attempt++;
                }

                if(guess > hundred_size_raw){
                    System.out.print("Sorry your guess is bigger than the right number\n");
                    attempt++;
                }
            }
            while(play);
        }

        if (difficulty.equals("3")) {
            max = 1000;
            min = 1;
            int thousand_size_raw = rand_num.nextInt(((max - min) + 1) + min);
            System.out.print("I have my number. What is your guess? ");
            do{
                guess = input.nextInt();
                if(guess == thousand_size_raw){
                    System.out.printf("Congrats you guessed the number in %d attempts\n", attempt);
                    System.out.println("Would you like to play again (1 for yes/ 2 for no)?");
                    int continue_play = input.nextInt();

                    if(continue_play == 1){
                        System.out.print("I have my number. What is your Guess\n");
                    }

                    if(continue_play == 2){
                        play = false;
                    }

                }
                if(guess < thousand_size_raw){
                    System.out.print("Sorry your guess is smaller than the right number\n");
                    attempt++;
                }

                if(guess > thousand_size_raw){
                    System.out.print("Sorry your guess is bigger than the right number\n");
                    attempt++;
                }
            }
            while(play);
        }

        if (difficulty == null || !difficulty.equals("1") && !difficulty.equals("2") && !difficulty.equals("3"))  {
           System.out.print("Hahaha your so funny entering the wrong number so quirky and original... now stop fooling around and enter the PROPER difficulty: ");



        }

    }
}
