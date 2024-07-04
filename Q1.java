public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount with 10000
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {
        // Using ternary operator to check if the amount is sufficient
        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient funds";
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Initialize the bank account with 10000
        Bank myBank = new Bank(10000);
        
        // Withdraw 5000
        myBank.withdraw(6000);
        
        // Deposit 5000
        myBank.deposit(10000);
        
        // Display total balance
        myBank.displayBalance();
    }
            }
