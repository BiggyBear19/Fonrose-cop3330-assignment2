/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex033;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eight_ball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> Eight_Ball_Choices = new ArrayList<>();

        Eight_Ball_Choices.add("Ask me Later.");
        Eight_Ball_Choices.add("Yes");
        Eight_Ball_Choices.add("No");
        Eight_Ball_Choices.add("maybe");


        System.out.print("What is your question loser?\n>");
        String question = input.nextLine();

        int random_answer = (int) (Math.random() * Eight_Ball_Choices.size());
        System.out.println(Eight_Ball_Choices.get(random_answer));

    }
}
