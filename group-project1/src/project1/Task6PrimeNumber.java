package project1;

import java.util.*;

public class Task6PrimeNumber {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            if(number%2!=0 && number%3!=0){
                if(number%number==0){
                    System.out.println(number + " is a prime number");
                }
            }else{
                System.out.println(number + " is not a prime number");
            }
    }
}
