package testBank;
import java.util.Scanner;

public class Menu
{
    Scanner console = new Scanner(System.in);
    Bank bank = new Bank();

    public void runMenu()
    {
        printHeader();
        printMenu();
    }

    public void printHeader()
    {
        System.out.println("+-------------------------------+");
        System.out.println("|        Welcome to CS121.1     |");
        System.out.println("|          Banking App          |");
        System.out.println("+-------------------------------+");

    }

    public void printMenu()
    {
        while (true)
        {
            String selection;
            System.out.println("\nPlease make a selection:\n"
                    + "1) Access account\n"
                    + "2) Open a new Account\n"
                    + "3) Exit");
            selection = console.nextLine();
            if (selection.equals("1"))
            {
                this.accessAccount();
            }
            else if (selection.equals("2"))
            {
                this.createNewAccount();
            }
            else if (selection.equals("3"))
            {
                System.out.println("Thank you for using CS121 Banking App");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid entry");
            }
        }
    }

    public void accessAccount()
    {
        Account account;
        System.out.println("Please enter your PIN:");
        String pin = console.nextLine();
        Customer customer = bank.getCustomer(pin);
        if (customer == null)
        {
            System.out.println("PIN is invalid");
            return;
        }
        System.out.println("What account would you like to access?\n"
                + "1) Checking\n"
                + "2) Savings");
        String which = console.nextLine();
        if (which.equals("1"))
        {
            customer.displayCheckingAccount();
            System.out.println("Please Enter the account number of the account you would like to access:");
            int accountNo = Integer.parseInt(console.nextLine());
            account = customer.findCheckingAccount(accountNo);
        }
        else
        {
            customer.displaySavingsAccount();
            System.out.println("Please Enter the account number of the account you would like to access:");
            int accountNo = Integer.parseInt(console.nextLine());
            account = customer.findSavingsAccount(accountNo);
        }
        System.out.println("Please make a selection:\n"
                + "1) Make a deposit\n"
                + "2) Make a withdrawal\n"
                + "3) See account balance");
        String selection = console.nextLine();
        if (selection.equals("1"))
        {
            System.out.println("Enter the amount of deposit:");
            double amount = Double.parseDouble(console.nextLine());
            account.deposit(amount);
        }
        else if (selection.equals("2"))
        {
            System.out.println("Enter the amount of withdrawal:");
            double amount = Double.parseDouble(console.nextLine());
            account.withdraw(amount);
        }
        else
        {
            account.getBalance();
        }
    }

    public Customer createNewCustomer()
    {
        String firstName;
        String lastName;
        String pin;

        System.out.println("Please enter your first name: ");
        firstName = console.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = console.nextLine();
        System.out.println("Please enter a 4 digit PIN: ");
        pin = console.nextLine();
        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(pin, customer);
        return customer;
    }

    public void createNewAccount()
    {
        String newCustomer;
        String accountType;
        Customer customer;
        CheckingAccount checkAccount;

        System.out.println("Are you a new customer?\n"
                + "1) Yes\n"
                + "2) No");
        newCustomer = console.nextLine();
        if (newCustomer.equals("1"))
        {
            customer = this.createNewCustomer();
        }
        else
        {
            System.out.println("Please enter PIN:");
            customer = bank.getCustomer(console.nextLine());
        }
        System.out.println("Select an account type:\n"
                + "1) Checking\n"
                + "2) Savings");
        accountType = console.nextLine();
        if (accountType.equals("1"))
        {
            System.out.println("Would you like to make an initial deposit to your "
                    + "checking account?\n"
                    + "1) Yes\n"
                    + "2) No");
            String initDeposit = console.nextLine();
            if (initDeposit.equals("1"))
            {
                System.out.println("Please enter deposit amount:");
                double deposit = Double.parseDouble(console.nextLine());
                checkAccount = new CheckingAccount(deposit);
            }
            else
            {
                checkAccount = new CheckingAccount();
            }
            customer.addCheckingAccount(checkAccount);
            System.out.println("\nNew Account Opened: ");
            customer.displayCheckingAccount();
        }
        else
            while (true)
            {
                System.out.println("An initial deposit of $100 is required to open a savings account\n"
                        + "Please enter the amount of your deposit:");
                double savingDeposit = Double.parseDouble(console.nextLine());
                if (savingDeposit >= 100)
                {
                    SavingAccount saving = new SavingAccount(savingDeposit);
                    customer.addSavingsAccount(saving);
                    customer.displaySavingsAccount();
                    break;
                }
            }
    }
}
