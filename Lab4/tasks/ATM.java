import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an id: ");
            int id = scanner.nextInt();

            if (id < 0 || id >= accounts.length) {
                System.out.println("Please enter a valid id.");
                continue;
            }

            Account currentAccount = accounts[id];
            while (true) {
                System.out.println("Main menu :");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double amountToWithdraw = scanner.nextDouble();
                        currentAccount.withdraw(amountToWithdraw);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double amountToDeposit = scanner.nextDouble();
                        currentAccount.deposit(amountToDeposit);
                        break;
                    case 4:
                        System.out.println("Exiting to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}
