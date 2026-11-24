//Experement 1-

// Implement a robust Java calculator
// program that accepts user input
// dynamically, performs mathematical
// operations using conditional statements
// and looping constructs, and handles errors
// efficiently.


//Experement 2-
// Implement a robust Java calculator
// program using conditional logic and looping
// constructs to perform mathematical
// operations and handle errors efficiently
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * one
 */
public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.err.println("Pr9");
        
        do {
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Division");
            System.out.println("4.modolous");
            System.out.println("5.Multipliaction");
            System.out.println("6.Power");
            System.out.println("7.Square Root");
            System.out.println("8.Exit");
            System.out.println("Entre a choice between (1-8) : ");
            try {
                choice = scanner.nextInt();
            if (choice == 8) {
                System.out.println("Bye..");
                break;
            }
            if (choice > 8 || choice <0) {
                System.out.println("This input is invalid please Entre a valid input.");
                continue;
            }
            double num1,num2;
            System.out.println("Ener the 1st number: ");
            num1 = scanner.nextDouble();
            System.out.println("Ener the 2nd number: ");
            num2 = scanner.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Sum is: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Substraction: "+(num1-num2));
                    break;
                case 3:
                    if (num2 == 0) {
                        System.out.println("Cant divide by zero.");
                    } else {
                        System.out.println("Division is: "+(num1/num2));
                    }
                    
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cant divide by zero.");
                    } else {
                        System.out.println("Modolous is: "+(num1%num2));
                    }
                    
                    break;
                case 5:
                    System.out.println("Multiplication: "+(num1*num2));
                    break;
                case 6:
                    System.out.println("Power num1 to num2: "+Math.pow(num1,num2));
                    break;
                case 7:
                    if (num1 < 0 || num2 < 0) {
                        System.out.println("Cant find Square root of negative numbers.");
                    } else {
                        System.out.println("Square root of 1st number: "+Math.sqrt(num1));
                        System.out.println("Square root of 2nd number: "+Math.sqrt(num2));
                    }
                    break;
            
                default:
                    break;
            }
            } catch (ArithmeticException e) {
                System.err.println("Enter valid numeric values.");
            } catch (InputMismatchException e) {
                System.err.println("Invalid choice came through.");
                scanner.nextLine();
            }
        } while (choice != 8);
        scanner.close();

    }
}