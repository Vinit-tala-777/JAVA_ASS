class BankAccount {
    String number = "12345";
    String name = "Karan";
    double balance = 5000;

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; }
    void check() { System.out.println(name + "'s Balance: ₹" + balance); }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(2000);
        account.withdraw(1500);
        account.check();
    }
}