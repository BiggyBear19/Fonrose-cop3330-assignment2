/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex027;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ID_Validator {


    public static boolean FirstName_Checker(String firstname){

        Pattern name1_reader = Pattern.compile("[A-Za-z]");

        Matcher name1_matcher = name1_reader.matcher(firstname);

        boolean firstname_verified = false;

        if(firstname == null){
            System.out.println("Please enter in a firstname: ");

        }


        if((!name1_matcher.find()) | (firstname.length() < 2)){

            System.out.println("PLease enter a name with more than 2 characters: ");

        }

        if(name1_matcher.find() && firstname.length() > 2){
            firstname_verified = true;

        }
        return firstname_verified;
    }

    public static boolean LastName_Checker(String lastname){

        Pattern name2_reader = Pattern.compile("[A-Za-z]");

        Matcher name2_matcher = name2_reader.matcher(lastname);

        boolean lastname_verified = false;

        if(lastname == null){
            System.out.println("Please enter in a lastname: ");

        }

        if((!name2_matcher.find()) | (lastname.length() < 2)){

            System.out.println("PLease enter a name with more than 2 characters: ");


        }

        if(name2_matcher.find() && lastname.length() > 2){
            lastname_verified = true;
        }
        return lastname_verified;

    }

    public static boolean Zipcode_Checker(String Zipcode){
        Pattern zip_reader = Pattern.compile("[0-9]");
        Matcher zip_matcher = zip_reader.matcher(Zipcode);
        boolean Zipcode_verified = false;

        if(Zipcode == null){
            System.out.println("Please enter in a zipcode: ");


        }

        if((!zip_matcher.find()) | (Zipcode.length() != 5)){

            System.out.println("Please enter in a valid zipcode: ");


        }

        if(zip_matcher.find() && Zipcode.length() == 5){
            Zipcode_verified = true;
        }

        return Zipcode_verified;

    }

    public static boolean Employee_Checker(String Employee_ID){

        Pattern ID_reader = Pattern.compile("[A-Z]{2}[-][0-9]{4}");
        Matcher ID_checker = ID_reader.matcher(Employee_ID);

        boolean ID_verified = false;

        if(Employee_ID == null){
            System.out.println("PLease enter in a valid Employee ID ");

        }

        if((!ID_checker.find())){
            System.out.println("Employee ID must be in the format of AA-1234 ");

        }

        if(ID_checker.find()){
            ID_verified = true;
        }
        return ID_verified;
    }

    public static void validateInput(String Employee_ID, String Zipcode, String lastname, String firstname){

        FirstName_Checker(firstname);

        LastName_Checker(lastname);

        Zipcode_Checker(Zipcode);

        Employee_Checker(Employee_ID);



        if(FirstName_Checker(firstname) && LastName_Checker(lastname) && Zipcode_Checker(Zipcode) && Employee_Checker(Employee_ID)){


            System.out.println("There were no errors found");
        }


    }
}
