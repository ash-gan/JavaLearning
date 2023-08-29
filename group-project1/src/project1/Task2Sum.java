package project1;

public class Task2Sum {

    public static void main(String[] args) {

        /*
        2. Create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */

        //define integer array and initialize  with 7 values
        int [] numbers = {60, 12, 45,67,89,10,56};
        //Define integer variable sum that will store sum of all values from array and initialize to 0
        int sum=0;

        for(int k=0; k<numbers.length; k++){
            sum= sum+numbers[k];
        }

        System.out.println("Sum of all values from array: "+sum);

    }
}
