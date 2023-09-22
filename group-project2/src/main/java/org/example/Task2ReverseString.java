package org.example;

import java.util.*;

public class Task2ReverseString {

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
        System.out.println("Reversed String is:" + Task2ReverseString.reversedString(stringInput));
    }
}
