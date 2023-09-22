package org.example;

import java.util.Scanner;

public class Task3Palindrome {

    public static  String reversedString(String str){
        String reversed = "";
        for(int i=str.length()-1; i>= 0; i--){
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String stringInput = input.next();

        String reversedString = Task3Palindrome.reversedString(stringInput);
        if(stringInput.equals(reversedString)){
            System.out.println( stringInput + " is a palindrome.");
        }else{
            System.out.println( stringInput + " is not a palindrome.");
        }

    }
}
