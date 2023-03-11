package ATM.Interface;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 50000; // initial account balance
        int choice = 0;
        
        System.out.println("Welcome to the ATM!");
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    int withdrawAmount = scanner.nextInt();
                    
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrawn $" + withdrawAmount);
                        System.out.println("New balance is: $" + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    int depositAmount = scanner.nextInt();
                    
                    balance += depositAmount;
                    System.out.println("Successfully deposited $" + depositAmount);
                    System.out.println("New balance is: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
