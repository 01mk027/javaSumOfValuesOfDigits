import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Creating variables and instance of Scanner class
        int number, tempNumber, numberOfDigits = 0, result = 0;
        Scanner input = new Scanner(System.in);
    //Prompt user and get value of number
        System.out.println("Enter a number: ");
        number = input.nextInt();
    //Assigning value of number to variable of tempNumber
    //to make comparison
        tempNumber = number;
    //Calculating number of digits of entered number
        while(number != 0)
        {
            number /= 10;
            numberOfDigits++;
        }
    //Reassigning number to previous value for determining
    //values of each digit
    System.out.println(numberOfDigits);
        number = tempNumber;
        int iterator = 0;
        while(number != 0)
        {
            result += (number % 10);
            number /= 10;
            iterator++;
        }
        System.out.println("Sum of values of digits of "+ tempNumber + " = " + result);
    }
}
