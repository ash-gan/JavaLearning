package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6NonRepeatingCharacter {

    public static Map<Character, int[]> generateHashMap(String string1){
        Map<Character, int[]> hm = new HashMap<>();

        for(int i =0; i < string1.length(); i++){
            if(!hm.containsKey(string1.charAt(i))){
                hm.put(string1.charAt(i), new int[] {i, 1});
            }else{
                int current_value = hm.get(string1.charAt(i))[1];
                hm.put(string1.charAt(i), new int[]{i, current_value + 1});
            }
        }
        return hm;
    }

    public static char getFirstNonRepeating(String stringInput){
        int indexOfFirstOccurance=stringInput.length();

        Map<Character, int[]> hm = Task6NonRepeatingCharacter.generateHashMap(stringInput);

        // Iterating HashMap through for loop
        for (Map.Entry<Character, int[]> set :
                hm.entrySet()) {
            // Printing all elements of a Map
            if(set.getValue()[1] == 1){
                if(set.getValue()[0] < indexOfFirstOccurance){
                    indexOfFirstOccurance = set.getValue()[0];
                }
            }
        }

        return stringInput.charAt(indexOfFirstOccurance);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string1 = input.next();

        System.out.println("First non repeating character is the string " + string1 + " is " + Task6NonRepeatingCharacter.getFirstNonRepeating(string1));
    }
}
