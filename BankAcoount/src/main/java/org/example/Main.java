package org.example;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(32000);
        bankAccount.withdraw(10000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(34000);
        System.out.println(bankAccount.getBalance());


    }
}