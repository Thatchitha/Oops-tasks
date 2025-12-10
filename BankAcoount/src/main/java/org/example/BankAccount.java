package org.example;

public class BankAccount {
    int balance=0;
    public void withdraw(double amount) throws InsufficientBalanceException  {
       try {
           if(amount<=0)
           {
               throw new IllegalArgumentException("Enter valid amount");
           }
       }
       catch (IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
        try{
            if(amount>balance)
            {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance -=amount;
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void deposit(double amount)
    {
        try {
            if(amount<=0)
            {
                throw new IllegalArgumentException("Enter valid amount");
            }
            balance +=amount;

        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }



    }
    public double getBalance() {
        return balance;
    }

}
