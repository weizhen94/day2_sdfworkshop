package sg.edu.nus.iss;

import java.util.*;

public class BankAccount {
    //use final such that you can change once then cannot change it in the future
    //all attributes should use private and should only be exposed to getter and setter 
    private final String accountNo; 
    private String fullName; 
    private long balance = 0; 
    private boolean isActive = true; 
    private Date accountStartDate; 
    private Date accountEndDate;

    //this is the constructor can use sourceaction 
    public BankAccount(String accountNo, String fullName) {
        this.accountNo = accountNo;
        this.fullName = fullName;
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
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
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

    

    
}
