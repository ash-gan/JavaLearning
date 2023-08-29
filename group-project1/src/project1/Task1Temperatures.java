package project1;
import java.util.Scanner;

public class Task1Temperatures {

    public static void main(String[] args) {

        /*
        Create a program that uses an array to store a list of temperatures for a week, and
        then uses a loop to find the highest and lowest temperature for the week.
         */
        // define an array with data type integer , of size 7 to store the temperatures for 7 days of the week
        int [] temperatures = new int[7];
        //an array storing the names of the week
        String [] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //define a int variable to store the highest temperature of the week and intialize to 0
        int highestTemperature = 0;
        //define a int variable to store the lowest temperature of the week and intialize to 0
        int lowestTemperature = 100;
        Scanner input = new Scanner(System.in);

        //use for loop to get user input of temperatures values for each day of the week and store it in array
        for(int i=0; i< weekdays.length; i++){
            System.out.println("What is the temperature on "+ weekdays[i]+ " of this week?");
            temperatures[i] = input.nextInt();
        }

        /*tested loop with multiple set of temperatures
        temperatures = {80,90,100,23,67,12,78} // all positive temperatures
        temperatures = {56, 67,-12, 45,67,-35,56} // duplicate highest temperatures
        temperatures = {-23, -34, -12,-7,-8,10,11} // temperatures less than 0 (negative numbers)
        */
        for(int j=0; j<temperatures.length; j++){
            if(temperatures[j] > highestTemperature){
                highestTemperature = temperatures[j];
            }

            if(temperatures[j] < lowestTemperature){
                lowestTemperature = temperatures[j];
            }

        }

        System.out.println("Highest temperature of the week: "+ highestTemperature);
        System.out.println("Lowest temperature of the week: "+ lowestTemperature);

    }
}
