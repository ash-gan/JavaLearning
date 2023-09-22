package org.example;

import java.util.Scanner;

public class Task4NumberOfWords {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        String[] words = stringInput.split(" ");
        System.out.println("Num of words in the string input is : " + words.length);
    }
}
