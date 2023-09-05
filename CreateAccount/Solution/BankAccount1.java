package Solution;

import java.math.BigDecimal;

public class BankAccount1 {
    public long accountNumber;
    public String ownerName;
    public BigDecimal balance;

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}

class CreateAccount1 {
    public static BankAccount1 createNewBankAccount(String accountNumber, BigDecimal balance) {
        BankAccount1 newAccount = new BankAccount1();
        newAccount.accountNumber = Long.parseLong(accountNumber);
        newAccount.ownerName = ownerName;

        newAccount.balance = balance;
        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount1 bankAccount1 = CreateAccount1.createNewBankAccount(1, new BigDecimal("0.0"));
        printBankAccount(bankAccount1);
    }

    public static void printBankAccount(BankAccount1 account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}