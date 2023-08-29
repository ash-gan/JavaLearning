package project1;

public class Task5Swap {

    public static void main(String[] args) {

        {
            int num1 = 234;
            int num2 = 685;
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
            System.out.println("After swapping:"
                    + " num1 = " + num1 + ", num2 = " + num2);
        }

    }
}
