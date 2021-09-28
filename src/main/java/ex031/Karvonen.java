/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex031;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Karvonen {
    public static void Karvonen_Test(String age, String heart_rate){
        double intensity;

        Scanner input = new Scanner(System.in);

        Pattern age_reader = Pattern.compile("[0-9]");
        Pattern heart_rate_reader = Pattern.compile("[0-9]");
        Pattern letter_checker = Pattern.compile("[A-Za-z]");
        Pattern special_checker = Pattern.compile("[!@#`~$%^&*()_=+;:?><,.]");
        Pattern letter_checker2 = Pattern.compile("[A-Za-z]");
        Pattern special_checker2 = Pattern.compile("[!@#`~$%^&*()_=+;:?><,.]");

        Matcher age_matcher = age_reader.matcher(age);
        Matcher heart_rate_matcher = heart_rate_reader.matcher(heart_rate);
        Matcher letter_matcher = letter_checker.matcher(age);
        Matcher special_matcher = special_checker.matcher(age);
        Matcher letter_matcher2 = letter_checker2.matcher(heart_rate);
        Matcher special_matcher2 = special_checker2.matcher(heart_rate);

        boolean beat = true;

        while(beat){
            if(age_matcher.find() && heart_rate_matcher.find() && !letter_matcher.find() && !special_matcher.find() && !letter_matcher2.find() && !special_matcher2.find()){
                System.out.printf("Resting heart rate: %s\t Age: %s", heart_rate, age);
                System.out.println();
                System.out.format("%-6s  %-20s","Intensity", "Heart Rate");
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");



                for(intensity = 55; intensity <= 95; intensity += 5) {
                    int heart_math = Integer.parseInt(heart_rate, 10);
                    int age_math = Integer.parseInt(age, 10);
                    double intensity_math = intensity / 100;

                    Double TargetHeartRate = (((220 - age_math) - heart_math) * intensity_math) + heart_math;

                    System.out.printf("%-6f%% %6f\n",intensity, TargetHeartRate);


                }
                beat = false;
            }


            if(!age_matcher.find() || age == null || !heart_rate_matcher.find() || heart_rate == null){
                System.out.println("Please enter in valid inputs: ");
                String raw = input.nextLine();

                System.out.println("Please enter in valid inputs: ");
                String raw2 = input.nextLine();

                Pattern age_retry = Pattern.compile("[0-9]");
                Pattern age2_retry = Pattern.compile("[A-Za-z]");
                Pattern age3_retry = Pattern.compile("[!@#`~$%^&*()_=+;:?><,.]");


                Matcher retry_matcher = age_retry.matcher(raw);
                Matcher retry2_matcher = age2_retry.matcher(raw);
                Matcher retry3_matcher = age3_retry.matcher(raw);

                Matcher heart_matcher = age_retry.matcher(raw2);
                Matcher heart2_matcher = age2_retry.matcher(raw2);
                Matcher heart3_matcher = age3_retry.matcher(raw2);


                if(retry_matcher.find() && !retry2_matcher.find() && !retry3_matcher.find() && heart_rate_matcher.find() && !heart2_matcher.find() && !heart3_matcher.find() || heart_matcher.find()){

                    System.out.printf("Resting heart rate: %s\t Age: %s", raw2, raw);
                    System.out.println();
                    System.out.format("%-6s  %-20s","Intensity", "Heart Rate");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------");



                for(intensity = 55; intensity <= 95; intensity += 5) {
                       int heart_math = Integer.parseInt(raw2, 10);
                       int age_math = Integer.parseInt(raw, 10);
                       double intensity_math = intensity / 100;

                        Double TargetHeartRate = (((220 - age_math) - heart_math) * intensity_math) + heart_math;

                        System.out.printf("%-6f%% %6f\n",intensity, TargetHeartRate);


                    }
                    beat = false;
                }
            }


        }

    }
}
