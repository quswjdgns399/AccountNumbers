package Starter;

import java.math.BigDecimal;

public class BankAccount {
    String accountNumber;
    String ownerName;
    BigDecimal balance;

    public void setData(long AccountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String accountNumber, String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.accountNumber = accountNumber;
        newAccount.ownerName = ownerName;
        newAccount.balance = balance;
        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount =
                CreateAccount.createNewBankAccount(String.valueOf(1), "Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Owner Name: " + account.ownerName);
        System.out.println("Balance: " + account.balance);
    }
}