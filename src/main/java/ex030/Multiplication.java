/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex030;

public class Multiplication {
    public static void main(String[] args) {
        int o;
        int i;

        for(i = 1; i <= 12; i++){
            for(o = 1; o <= 12; o++){
                System.out.printf("%4d", i * o);
            }

            System.out.println();
        }


    }
}
