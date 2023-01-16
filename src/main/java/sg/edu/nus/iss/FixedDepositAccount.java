package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
//static makes the value fixed
//if private need to use getter and setter to access the value 
public static double interest = 3.0; 
public static double duration = 6.0; 

public FixedDepositAccount (String accountNo, double balance){
super (accountNo, balance); 
//TODO Auto generated constructor stub 
}


@Override 
public void deposit(double amount){
    System.out.println("NO Deposit operation");
}

@Override 
public void withdraw(double amount){
    System.out.println("NO Withdrawal operation");
}

@Override 
public void showAccount(){
    //use this to access the parent class function, through the getter and setter, because the child class does not have these fields so cannot put +accountNO
    System.out.println("Account No: " + this.getAccountNo());
    System.out.println("Fullname: " + this.getFullName());
    System.out.println("Balance: " + this.getBalance() * (100 + interest)/100);
}


}
