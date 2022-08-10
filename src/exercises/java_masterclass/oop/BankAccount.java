package exercises.java_masterclass.oop;

public class BankAccount {

    public BankAccount() {
        this("12345", 0.00, "default full name", "default email address", "default phone number");
        System.out.println("Default constructor called.");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $ " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only $ " + this.balance + " is available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $ " + withdrawalAmount + " processed. Remaining balance is $ " + this.balance);
        }
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        System.out.println(bA.getCustomerName());
        System.out.println(bA.getBalance());
        BankAccount bobsAccount = new BankAccount("123", 500.25, "Bob Newman", "youremail@gmail.com", "(82) 10-7358-0225");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        bobsAccount.depositFunds(20);
        bobsAccount.withdrawFunds(119.99);
    }
}
