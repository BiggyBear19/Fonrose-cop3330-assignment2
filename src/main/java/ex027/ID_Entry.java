/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex027;

import java.util.Scanner;

public class ID_Entry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ID_Validator input_check = new ID_Validator();

        System.out.print("Please enter in your firstname: ");
        String entryname1 = input.nextLine();

        System.out.print("Please enter in your last name: ");
        String entryname2 = input.nextLine();

        System.out.print("Please enter in your Zipcode: ");
        String zipentry = input.nextLine();

        System.out.print("Please enter in you Employee ID: ");
        String IDentry = input.nextLine();

        input_check.validateInput(IDentry, zipentry, entryname2, entryname1);





    }
}
