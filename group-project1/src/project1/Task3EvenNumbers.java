package project1;

public class Task3EvenNumbers {

    public static void main(String[] args) {

        //Define and initialize 2D array with integer values
        int [][] numbers = {{23, 35, 48, 56, 79},
                            {56, 78, 45, 89, 23},
                            {89, 45, 23, 76, 20},
                            {10, 20, 20, 40, 50}};

        //Iterate and identify if number is even and print
        for(int row =0; row < numbers.length; row++){
            for(int col=0; col < numbers[row].length; col++){
                if(numbers[row][col] %2 ==0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }

    }
}
