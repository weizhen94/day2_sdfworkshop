package sg.edu.nus.iss;

import java.util.*;

public class BankAccount {
    //use final such that you can change once then cannot change it in the future
    //all attributes should use private and should only be exposed to getter and setter 
    private final String accountNo; 
    private String fullName; 
    private double balance = 0; 
    private boolean isActive = true; 
    private Date accountStartDate; 
    private Date accountEndDate;

    //this is the constructor can use source action 
    public BankAccount(String accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
    }

    public BankAccount(String accountNo, String fullName) {
        this.accountNo = accountNo;
        this.fullName = fullName;
    }



    public void deposit (double amount){
        if (!isActive){
            throw new IllegalArgumentException("You cannot make deposit to a closed account"); 
        }

        if (amount < 0){
            throw new IllegalArgumentException("You cannot make a negative deposit"); 
        } else {
            balance = balance + amount; 
        }

    }

    public void withdraw(double amount){
        if (!isActive){
            throw new IllegalArgumentException("You cannot make deposit to a closed account"); 
        }

        if (amount < 0){
            throw new IllegalArgumentException("You cannot make a negative deposit"); 
        } else {
            balance = balance + amount; 
        }
    }


    public String getAccountNo() {
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    } 

    public void showAccount(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Full Name: " +fullName);
        System.out.println("Balance: " +balance);
    }

    

    
}
