
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for three numbers
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        // Calculate the average and turn it into a double type
        double average = (1.0 * (firstNumber + secondNumber + thirdNumber)) / 3;
        // Print the average to the console
        System.out.println("The average is " + average);
    }
}
