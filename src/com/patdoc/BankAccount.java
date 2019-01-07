package com.patdoc;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default email address",
                "default phone"); // overload constructors to call one below with default values
        System.out.println("Empty constructor called");
    }


    public BankAccount(String accountNumber, double balance, String customerName,
                   String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){

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
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void withdraw(double amount){
        if ((amount > 0) && (amount <= this.balance)){
            this.balance -= amount;
            System.out.println("Your new balance is: " + this.balance);
        }else {
            System.out.println("You have insufficient funds");
        }
    }

    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Your new balance is: " + this.balance);
        }else{
            System.out.println("Invalid amount to deposit");
        }
    }

}
