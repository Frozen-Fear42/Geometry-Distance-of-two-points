// Name: Humphrey Boahen
// Course Name: CS155-019
// Assignment Name: PA 2

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // initiating a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Declaring a variable to store the user's input
        String firstPoint;
        String secondPoint;
        double x1;
        double x2;
        double y1;
        double y2;

        // Loop to validate user's input for the first point
        while (true) {
            try {
                // prompt the user to enter values for x1 and y1 and storing it
                System.out.println("Enter x1 and y1: ");
                firstPoint = scanner.nextLine();

                // Getting the x1 and y1 value
                String[] arrOfStr = firstPoint.split(" ");
                x1 = Double.parseDouble(arrOfStr[0]);
                y1 = Double.parseDouble(arrOfStr[1]);
                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Input!!");
                System.out.println("Enter a number for both x1 and y1 separated be space");
            }
        }

        // Loop to validate user's input for the first point
        while (true) {
            try {
                // prompt the user to enter values for x2 and y2 and storing it
                System.out.println("Enter x2 and y2: ");
                secondPoint = scanner.nextLine();

                // Getting the x2 and y2 values
                String[] arrOfStr2 = secondPoint.split(" ");
                x2 = Double.parseDouble(arrOfStr2[0]);
                y2 = Double.parseDouble(arrOfStr2[1]);
                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Input!!");
                System.out.println("Enter a number for both x2 and y2 separated be space");
            }
        }

        // Calculating the distance between two points
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Displaying the distance
        System.out.println("The Distance between the two points is " + distance);

        // closing the scanner
        scanner.close();
    }
}