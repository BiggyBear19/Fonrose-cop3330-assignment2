/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package ex024;

import java.util.Arrays;

public class Anagram_Finder{


    String word1;

    String word2;


    public void enter_word_1(String word1){
        this.word1 = word1;

        word1.toLowerCase();

    }

    public void setWord2(String word2){
        this.word2 = word2;

        word2.toLowerCase();

    }

    public boolean isAnagram(String word1, String word2){

        int length1 = word1.length();
        int length2 = word2.length();

        char[] word1_arr = word1.toCharArray();
        char[] word2_arr = word2.toCharArray();

        Arrays.sort(word1_arr);
        Arrays.sort(word2_arr);

        if(Arrays.equals(word1_arr, word2_arr) && (length1 == length2)){
            System.out.println("These two words are an anagram");
            return true;
        }

        else{
            System.out.println("These two words are an anagram");
            return false;
        }
    }
}
