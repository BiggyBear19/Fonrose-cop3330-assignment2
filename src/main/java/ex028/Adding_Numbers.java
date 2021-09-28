/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex028;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Adding_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int[] numbers;
        int total;
        numbers = new int[5];

        for(i=0; i <= 4; i++){

            System.out.printf("Please enter in number %d: ", i);
            numbers[i] = input.nextInt();


        }
        total = IntStream.of(numbers).sum();

        System.out.printf("The sum of those numbers is %d ", total);
    }
}
