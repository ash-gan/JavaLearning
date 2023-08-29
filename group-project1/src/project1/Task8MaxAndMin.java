package project1;

public class Task8MaxAndMin {

    public static void main(String[] args) {

        int [] numbers = {23, 34, 56, 67, 78, 12, 45, 78, -1, 10};

        int HighestNumber = 0;

        for(int i =0 ; i < numbers.length; i++) {

            if (numbers[i] > HighestNumber){
                HighestNumber = numbers[i];
            }
        }

        int LowestNumber = HighestNumber;
        System.out.println(HighestNumber);
        for (int j=0; j < numbers.length; j++){

            if(numbers[j] < LowestNumber){
                LowestNumber = numbers[j];
            }
        }

        System.out.println(LowestNumber);
    }
}
