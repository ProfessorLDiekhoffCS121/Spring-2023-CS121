package testBank;

public class CheckingAccount extends Account{
    private String accountType = "Checking";

	public CheckingAccount()
    {
        super();
        this.setBalance(0);
    }

	public CheckingAccount(double initialDeposit)
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
}

