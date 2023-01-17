package testBank;
import java.util.HashMap;

public class Bank {// a HashMap of customers
    private HashMap<String, Customer> customers = new HashMap<>();

    // add a customer to the HashMap
    public void addCustomer(String pin, Customer customer)
    {
        customers.put(pin, customer);
    }

    // return customer by pin
    public Customer getCustomer(String pin)
    {
        if (customers.containsKey(pin))
        {
            return customers.get(pin);
        }
        else
            return null;
    }
}

