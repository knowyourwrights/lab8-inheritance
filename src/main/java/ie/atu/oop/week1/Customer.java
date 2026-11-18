package ie.atu.oop.week1;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String phoneNumber, //comes from parent "Person"
                    int customerNumber, boolean mailingList) //belonging to Customer specifically
    {
        super(name, address, phoneNumber); // will say expected no arguments if you dont include "extends [Parent]"
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public Customer()
    {
        super();
        this.customerNumber = 0;
        this.mailingList = false;

    }
    //getters and setters. name/address/phoneNumber dont need these here because theyre already defined
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
    //toString; see Person.java comment
    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
