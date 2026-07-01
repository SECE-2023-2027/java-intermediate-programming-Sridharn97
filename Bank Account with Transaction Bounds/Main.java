import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        System.out.println("The Balance Amout is: "+account.getBalance());

        scanner.close();
    }
}