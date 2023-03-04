package NGS.NHN.code.day06;

import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    private static long nextAccountNumber;

    public static long nextNumber() {
        return nextAccountNumber++;
    }

    public void transferForm(BankAccount accFrom, BigDecimal amount) {
        if (this.withDraw(amount)) {
            accFrom.deposit(amount);
        }
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
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
    
    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    public boolean withDraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }
    
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void TestDeposit(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        account.deposit(amount);
    }

    public static void TestWithDraw(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)) {
            System.out.println("Insufficient funds!");
        }
    }
    
    public static void main(String[] args) {
    	BankAccount bankAccount = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("100.0"));
    	BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Celine ", new BigDecimal("30.0"));    
    	bankAccount.transferForm(bankAccount2, new BigDecimal("50"));
    	printBankAccount(bankAccount);
    	printBankAccount(bankAccount2);
    }
    
    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance() + "\n");
    }
}