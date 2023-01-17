package testBank;

public class SavingAccount extends Account{
    private String accountType = "Savings";

	public SavingAccount(double initialDeposit)
    {
        super();
        this.deposit(initialDeposit);
    }

    private String getAccountType()
    {
        return accountType;
    }

    public String getAccountInfo()
    {
        return String.format("%nAccount Type: %s Account%n"
                        + "Account Number: %d%n"
                        + "Balance: %.2f%n"
                        + "Interest Rate: %.0f%%%n",
                this.getAccountType(), this.getAccountNumber(), this.getBalance(),
                this.getInterest());
    }

    public void checkInterest(double amount)
    {
        if (this.getBalance() + amount > 10000)
        {
            this.setInterest(0.07);
        }
        else
        {
            this.setInterest(0.04);
        }
    }
}

