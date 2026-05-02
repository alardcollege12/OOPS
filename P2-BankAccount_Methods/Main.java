class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println(accountNumber + " " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 1000);
        b.deposit(500);
        b.withdraw(100);
        b.display();
    }
}