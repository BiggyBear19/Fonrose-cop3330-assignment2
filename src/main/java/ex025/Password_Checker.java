/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex025;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Password_Checker {

    String password;



    public void passwordValidator(String password) {

        int length = password.length();

        Pattern digit_reader = Pattern.compile("[A-za-z]");
        Pattern letter_reader = Pattern.compile("[0-9]");
        Pattern special_reader = Pattern.compile("[`~!@#$%^&*()_=+{};:|?/.,><]");

        Matcher digit_matcher = digit_reader.matcher(password);
        Matcher letter_matcher = letter_reader.matcher(password);
        Matcher special_matcher = special_reader.matcher(password);

        if((digit_matcher.find() == true) && (letter_matcher.find() == true) && (special_matcher.find() == true) && (length >= 8)){

            System.out.printf("%s is a very strong password", password);
        }

        else if((digit_matcher.find() == true) && (letter_matcher.find() == true) && (length >= 8)){

            System.out.printf("%s is a strong password", password);
        }

        else if((letter_matcher.find() == true) && (length < 8)){

            System.out.printf("%s is a weak password", password);
        }

        else if((letter_matcher.find() == true) && (length < 8)){

            System.out.printf("%s is a very weak password", password);
        }

        else if((digit_matcher.find() == false) && (letter_matcher.find() == false) && (special_matcher.find() == false)){

            System.out.println("Please enter in a valid password");
        }

        else {

            System.out.printf("%s is a very average password", password);
        }

    }






}
