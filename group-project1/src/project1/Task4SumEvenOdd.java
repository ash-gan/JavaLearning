package project1;

public class Task4SumEvenOdd {

    public static void main(String[] args) {


        //Define and initialize numbers array of type integer
        int [][] numbers = {{23, 45, 23, 34 , 56},
                            {56, 78, 34, 25,46},
                            {78, 22, 11, 43, 64, 82},
                            {66, 52, 33, 72, 81, 93}};

        // Define and initialize 2 variables to store even and odd numbers sum
        int evenSum = 0;
        int oddSum = 0;

        //Iterate with two arrays, identify even and odd numbers and add
        for(int row=0; row < numbers.length; row++){
            for(int col=0; col < numbers[row].length; col++){

                if(numbers[row][col]%2==0){
                    evenSum = evenSum + numbers[row][col];
                }else{
                    oddSum = oddSum + numbers[row][col];
                }

            }
        }
        //Print final even and odd numbers sum
        System.out.println(evenSum);
        System.out.println(oddSum);


    }
}
