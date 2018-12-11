package com.jimmy;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1,0,"Default Customer","default@somewhere.com","800-555-1212");
        System.out.println("Constructor without parameters");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.getCustomerName();
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(int accountNumber, double amount){
        if(accountNumber == this.getAccountNumber()) {


            System.out.println("Account# " + this.getAccountNumber() + " has a balance of " + this.getBalance());
            this.setBalance((this.getBalance()+amount));
            System.out.println("Deposited " + amount + " to account# " + this.getAccountNumber());
            System.out.println("The balance is now " + this.getBalance());
        } else {
            System.out.println("Invalid account number " + accountNumber);
        }
    }

    public void withdraw(int accountNumber, double amount) {
        if (accountNumber == this.getAccountNumber()) {
            if (amount <= this.getBalance()) {
                System.out.println("The current balance is " + this.getBalance());
                this.setBalance((this.getBalance() - amount));
                System.out.println("After withdrawing " + amount);
                System.out.println("The new balance is " + this.getBalance());
            } else {
                System.out.println("Amount of " + amount + " is greater than the balance of " + this.getBalance());
            }

        } else {
            System.out.println("Invalid account number " + accountNumber);
        }
    }

    public void printInfo(){
            System.out.println(this.accountNumber);
            System.out.println(this.balance);
            System.out.println(this.customerName);
            System.out.println(this.email);
            System.out.println(this.phoneNumber);
    }

}
