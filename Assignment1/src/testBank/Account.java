package testBank;

public class Account
{
    private static int numberOfAccounts = 1000;
    private double balance;
    private double interest;
    private int accountNumber;

    public Account()
    {
        this.accountNumber = incrementNumberOfAccounts();
    }

    public static int getNumberOfAccounts()
    {
        return numberOfAccounts;
    }

    public static int incrementNumberOfAccounts()
    {
        return Account.numberOfAccounts++;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getInterest()
    {
        return interest;
    }

    public void setInterest(double interest)
    {
        this.interest = interest;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Please enter positive amount.");
            return;
        }
        checkInterest(amount);
        balance += amount + amount * interest;
        System.out.printf("You have deposited $%.2f with an interest rate of %.0f%%.%n",
                amount, this.getInterest() * 100);
        System.out.printf("You now have a balance of %.2f.%n", balance);
    }

    public void withdraw(double amount)
    {
        if (amount > this.balance)
        {
            System.out.println("You have insufficient funds.");
            return;
        }
        this.balance -= amount;
        checkInterest(0);
        System.out.printf("You have withdrawn %.2f.%n"
                + "You now have a blance of %.2f%n", amount, this.balance);
    }

    public void checkInterest(double amount)
    {
        if (balance + amount > 10000)
        {
            this.setInterest(0.05);
        }
        else
        {
            this.setInterest(0.02);
        }
    }
}
