/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex025;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter in a password: ");

        String entry = input.nextLine();

        Password_Checker password_entry = new Password_Checker();

        password_entry.passwordValidator(entry);
    }
}
