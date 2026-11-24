import java.util.Scanner;
import java.util.InputMismatchException;;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000;//Starting Account Balcance

        System.out.println("==Practical 6: ATM Machine Simulator==");


        while (true) {
            System.out.println("\n--ATM Menu--");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposite Money");
            System.out.println("3.WithDraw Moeny");
            System.out.println("4.Exit");
            System.out.println("Select an option(1-4): ");
            
            try {           
                int choice = scanner.nextInt();

                if (choice == 4) {
                    System.out.println("Thanks For visiting out Bank..!!");
                    break;
                }
                switch (choice) {
                    case 1:
                        System.out.println("Current Balance");
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        // Rule 1: Catch invalid (zero or negative) deposits
                        if (depositAmount <= 0) {
                            throw new IllegalArgumentException("Deposit must be greater than zero");
                        }

                        balance += depositAmount;
                        System.out.println("Deposit Rs. " + depositAmount + "| New Balance: Rs. " + balance);
                        break;

                    case 3:
                        System.out.println("Enter Amount to withdraw:  ");
                        double withdrawAmount = scanner.nextDouble();
                        // Rule 2: Catch invalid (zero or negative) withdrawals
                        if (withdrawAmount<=0) {
                            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
                        }
                        // Rule 2: Catch invalid (zero or negative) withdrawals
                        if (withdrawAmount > balance) {
                            throw new ArithmeticException("Insufficent Balance, Avaliable Balance is Only: " + balance);
                        }
                        balance -= withdrawAmount;
                        System.out.println("Withdraw Rs. "+ withdrawAmount + "Remaning Balance: Rs. " + balance);
                        break;
                    default:
                        System.out.println("Invalid Option, Please chose between 1 and 4");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input error: " + e.getMessage());
            }  catch (ArithmeticException e) {
                System.out.println("Tranction Declined: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Format Error: Please entre nueric values only ");
                scanner.nextLine();
            }
            finally {
                // Always executes after every menu attempt
                System.out.println("[Session Log: Transaction cycle completed]");
            }
        }
        scanner.close();
    }
}
