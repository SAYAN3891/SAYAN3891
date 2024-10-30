import java.util.Scanner;

public class atm {
    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit;
        final Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\t\t\t\t\t\t\tAuto mated teller machine");
            System.out.println(".............chose 1 for withdraw");
            System.out.println(".............chose 2 for deposit");
            System.out.println(".............chose 3 for balance");
            System.out.println(".............chose 4 for exit");
            System.out.println("chose the oparator you want to perform");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nEnter the money to be withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    } else {
                        System.out.println("\nInsufficient balance");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("\nEnter the money to be deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your money has been deposit");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("\nBalance:" + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}