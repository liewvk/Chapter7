import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        do {
            System.out.println();
            System.out.println("Simple ATM Menu");
            System.out.println("---------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current balance: $ %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: $ ");
                    double deposit = input.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: $ ");
                    double withdrawal = input.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance = balance - withdrawal;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }
}
