public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalMoney = this.checkingBalance + this.savingsBalance;
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account

    public double deposit(double amount, String acc) {

        if (acc == "checking") {
            this.checkingBalance += amount;
            totalMoney += amount;
        } else if (acc == "saving") {
            this.savingsBalance += amount;
            totalMoney += amount;
        } else {
            System.out.println("The amount you entered is not enough for a deposit");
        }

        return totalMoney;
    }
    // withdraw
    // - users should be able to withdraw money from their checking or savings

    public double withdraw(double amount, String acc) {

        if (acc == "checking") {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        } else if (acc == "saving") {
            this.savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("The amount you entered is not enough for a withdraw");
        }

        return totalMoney;
    }
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void display() {

        System.out.println("Checking Account: $" + this.checkingBalance);
        System.out.println("Saving Account: $" + this.savingsBalance);
        System.out.println("Total Amount: $" + (this.checkingBalance + this.savingsBalance));

    }
}
