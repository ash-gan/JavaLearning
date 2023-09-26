package org.example;

import java.util.ArrayList;

public class Task7StringsStartingWithA {

    public static void main(String[] args) {

        String[] input = new String[]{"America", "Brazil", "China", "Denmark", "Kenya", "France", "Germany", "Albania", "Australia", "Aradhya"};
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i < input.length ; i++){

            if(input[i].toLowerCase().startsWith("a")){
                arr.add(input[i]);
            }
        }
        System.out.println(arr);
    }
}
