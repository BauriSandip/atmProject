import java.util.Scanner;

class Atm {
    float Balance;
    int PIN = 5674;

    public void CheckPin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Invailed Pin");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1.Check A/C Blance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposite Money");
        System.out.println("4.Exit");

        Scanner r = new Scanner(System.in);
        int opt = r.nextInt();

        if (opt == 1) {
            checkBlance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a vailed choice");
        }
    }

    public void checkBlance() {
        System.out.println("Balance" + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to Withdraw: ");
        Scanner r = new Scanner(System.in);
        float amount = r.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficeint Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Suucessful");
        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Enter The Amount Money");
        Scanner r = new Scanner(System.in);
        float amount = r.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Sucessfully");
        menu();
    }
}

class AtmMachine {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.CheckPin();
    }
}