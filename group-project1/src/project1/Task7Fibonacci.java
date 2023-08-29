package project1;

public class Task7Fibonacci {

    public static void main(String[] args) {

        int [] Fibonacci = new int [10];
        Fibonacci[0] = Fibonacci[1]= 1;

        for(int i=2; i < Fibonacci.length; i++){
        Fibonacci[i]= Fibonacci[i-1]+ Fibonacci[i-2];
        }

        for(int j=0; j < Fibonacci.length; j++){
            System.out.println(Fibonacci[j]);
        }

    }
}
