public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts

        BankAccount one = new BankAccount(200, 100);
        BankAccount two = new BankAccount(400, 200);
        BankAccount three = new BankAccount(500, 700);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney

        one.deposit(100, "saving");
        two.deposit(25, "checking");
        three.deposit(500, "checking");

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        one.withdraw(76, "checking");
        two.withdraw(24, "saving");
        three.withdraw(99, "checking");

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Accounts total: " + BankAccount.getAccounts());
        System.out.println("$" + BankAccount.getTotalMoney());

    }
}
