/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex034;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Termination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <String> Employees = new ArrayList<>();

        Employees.add("Mordecai");
        Employees.add("Rigby");
        Employees.add("Skips");
        Employees.add("Mitch");

        System.out.println(Employees.toString().replaceAll("^.|.$", "").replace(", ", "\n"));

        System.out.println("Select a name you want to be removed from the list: ");
        String pink_slip = input.nextLine();

        if(pink_slip.equals("Mordecai")){
            Employees.remove(0);
        }
        else if(pink_slip.equals("Rigby")){
            Employees.remove(1);
        }
        else if(pink_slip.equals("Skips")){
            Employees.remove(2);
        }
        else if(pink_slip.equals("Mitch")){
            Employees.remove(3);
        }

        System.out.println(Employees.toString().replaceAll("^.|.$", "").replace(", ", "\n"));

    }
}
