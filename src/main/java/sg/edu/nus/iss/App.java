package sg.edu.nus.iss;

//to add all the java util function
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    //static makes the value fixed
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int n = 3; 
        BankAccount bankAccount [] = new BankAccount[n]; 

        for(int i = 0; i < bankAccount.length; i++){
            //to generate a randome number
            String uuid = UUID.randomUUID().toString(); 

            double max = 10000.00; 
            double min = 10000.00; 

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();  

            bankAccount[i] = new BankAccount (uuid, initialBalance); 
        }

        bankAccount[0].setFullName("Tan");
        bankAccount[1].setFullName("Ng");
        bankAccount[2].setFullName("Koh");

        bankAccount[0].showAccount(); 
        bankAccount[1].showAccount(); 
        bankAccount[2].showAccount(); 

        bankAccount[0].deposit(2000); 
        bankAccount[0].deposit(4000); 
        bankAccount[0].deposit(5000); 

        bankAccount[0].showAccount(); 
        bankAccount[1].showAccount(); 
        bankAccount[2].showAccount(); 

        bankAccount[0].withdraw(2000); 
        bankAccount[0].withdraw(4000);  
        bankAccount[0].withdraw(5000); 

        bankAccount[0].showAccount(); 
        bankAccount[1].showAccount(); 
        bankAccount[2].showAccount(); 



    


        
    }
}
