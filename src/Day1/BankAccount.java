package Day1;

public class BankAccount {
    int id;
    String name;
    double balance;

    void addToBalance(double add) {

        System.out.println("Balance before deposit: $" + balance);
        System.out.println("Deposit amount $" + add);
        balance += add;
        System.out.println("Current balance after the deposit: $" + balance);
        System.out.println();
    }

    void subtractFromBalance(double subtract) {

        System.out.println("Balance before some spending: $" + balance);
        System.out.println("Spending amount: $" + subtract);
        balance -= subtract;
        System.out.println("Current balance after spending: $" + balance);
    }
}
   class BankAccountTest {
       public static void main(String[] args) {
           BankAccount bA = new BankAccount();
           bA.id = 1;
           bA.name = "Evgeny";
           bA.balance = 10000;
           bA.addToBalance(250.5);
           bA.subtractFromBalance(500.3);
       }
    }
