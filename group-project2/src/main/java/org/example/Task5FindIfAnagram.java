package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class Task5FindIfAnagram {

    public static boolean checkAnagram(String string1, String string2){
        char charArray1[] = string1.toLowerCase().toCharArray();
        char charArray2[] = string2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();

        boolean res = Task5FindIfAnagram.checkAnagram(string1, string2);
        System.out.println(res);


    }
}
