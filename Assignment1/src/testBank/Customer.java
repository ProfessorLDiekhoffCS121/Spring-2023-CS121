package testBank;
import java.util.ArrayList;

public class Customer
{
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<SavingAccount> savingsAccounts = new ArrayList<>();
    private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String pin)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPin()
    {
        return pin;
    }

    public void setPin(String pin)
    {
        this.pin = pin;
    }

    public void displaySavingsAccount()
    {
        // print all checking accounts info
        for (SavingAccount account : savingsAccounts)
        {
            System.out.println(account.getAccountInfo());
        }
    }

    public SavingAccount findSavingsAccount(int accountNumber)
    {
        SavingAccount found = null;
        for (SavingAccount account : savingsAccounts)
        {
            if (account.getAccountNumber() == (accountNumber))
            {
                found = account;
            }
        }
        return found;
    }

    public void addSavingsAccount(SavingAccount savingsAccount)
    {
        this.savingsAccounts.add(savingsAccount);
    }

    public void displayCheckingAccount()
    {
        // print all checking accounts info
        for (CheckingAccount account : checkingAccounts)
        {
            System.out.println(account.getAccountInfo());
        }
    }

    public CheckingAccount findCheckingAccount(int accountNumber)
    {
        CheckingAccount found = null;
        for (CheckingAccount account : checkingAccounts)
        {
            if (account.getAccountNumber() == (accountNumber))
            {
                found = account;
            }
        }
        return found;
    }

    public void addCheckingAccount(CheckingAccount checkingAccount)
    {
        this.checkingAccounts.add(checkingAccount);
    }

    public String customerInfo()
    {
        return String.format("First Name: %s%n"
                        + "Last Name: %s%n"
                        + "PIN: %s%n",
                this.firstName, this.lastName, this.pin);
    }
}
