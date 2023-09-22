package org.example;

public class Task1SwapString {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        System.out.println("String s1 before the swap has the value of: " + s1);
        System.out.println("String s2 before the swap has the value of: " + s2);
        s1 = s1 + s2;
        s2 = s1;
        s1=s1.substring(5);
        s2=s2.substring(0,5);
        System.out.println("String s1 after the swap has the value of: " + s1);
        System.out.println("String s2 after the swap has the value of: " + s2);
    }
}
