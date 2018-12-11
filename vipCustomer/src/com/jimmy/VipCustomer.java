package com.jimmy;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        this.printVIP();
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"default@somewhere.com");
    }

    public VipCustomer() {
        this("default VIP",10,"default@somewhere.com");
        System.out.println("empty parameters called");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private void printVIP(){
        System.out.println(this.getName() + " has a credit limit of " + this.getCreditLimit() + " and can be reached at " + this.getEmail());
    }
}
