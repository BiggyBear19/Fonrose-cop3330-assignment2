/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */


package ex024;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anagram_Finder my_entry = new Anagram_Finder();

        System.out.println("Please enter in the first word: ");

        String first_word = input.nextLine();

        my_entry.enter_word_1(first_word);

        System.out.println("Please enter in the second word: ");

        String second_word = input.nextLine();

        my_entry.setWord2(second_word);

        my_entry.isAnagram(first_word, second_word);


    }
}
