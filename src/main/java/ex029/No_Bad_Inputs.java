/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex029;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No_Bad_Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter in the rate: ");
        String r_raw = input.nextLine();

        Pattern letter_reader = Pattern.compile("[A-za-z]");
        Pattern special_reader = Pattern.compile("[`~!@#$%^&*()_=+{};:|?/.,><]");
        Pattern digit_reader = Pattern.compile("[0-9]");

        Matcher letter_matcher = letter_reader.matcher(r_raw);
        Matcher special_matcher = special_reader.matcher(r_raw);
        Matcher digit_matcher = digit_reader.matcher(r_raw);


        boolean TSA = true;


       while(TSA) {
           if ((letter_matcher.find() == true) || (special_matcher.find() == true) || r_raw.equals("0")) {

               System.out.print("Please enter in a valid input : ^ ) ");
               String raw = input.nextLine();
               Matcher letter_matcher2 = letter_reader.matcher(raw);
               Matcher special_matcher2 = special_reader.matcher(raw);
               Matcher digit_matcher2 = digit_reader.matcher(raw);

               if((letter_matcher2.find() == false) && (special_matcher2.find() == false) && !raw.equals("0")){
                   int r = Integer.parseInt(raw);
                   int years = 72/r;

                   System.out.printf("It will take %d years to double your investment", years);

                   TSA = false;

               }
           }
       }
    }
}
