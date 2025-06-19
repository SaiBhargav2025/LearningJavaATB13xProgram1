package Test;
//6. Write a program to check if a number is positive, negative, or zero. in jva
import  java.util.Scanner;
public class Numberchek {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user to enter a number
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

            scanner.close();
        }
    }

