package oopPractice;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 BankAccount account=null;
     //SavingsAccount SavingsAccount=new SavingsAccount("PK154754045","Muhammad Kazim",10000.0,5000);
     //CurrentAccount CurrentAccount=new CurrentAccount("PK458798989","Milo",10000.0,5000.0);
     
     System.out.println("Select your Account type:\n1:SavingsAccount\t2:CurrentAccount");
     int accType=sc.nextInt();
     
     if(accType==1) {
    	 account = new SavingsAccount("PK154754045","Muhammad Kazim",10000.0,5000);     
     }
     else if(accType==2) {
    	 account=new CurrentAccount("PK458798989","Milo",5000.0,5000.0);
     }
     else {
    	 System.out.println("ERROR");
     }
     
     
     boolean running =true;
     while(running) {
    	 
     
     System.out.println("\nAccount Type: " + account.getClass().getSimpleName());
     System.out.println("1:Deposit");
     System.out.println("2:Withdraw");
     System.out.println("3:Check Balance");
     System.out.println("Exit");
     System.out.println("Enter your choice:");
     
     int choice=sc.nextInt();
     
     switch(choice) {
     case 1:
    	 System.out.println("Enter amount to deposit:");
    	 double depositAmount=sc.nextDouble();
    	 account.deposit(depositAmount);
    	 break;
    	 
     case 2:
    	 System.out.println("Enter amount to withdraw:");
    	 double withdrawAmount=sc.nextDouble();
    	 account.withdraw(withdrawAmount);
    	 break;
    	 
     case 3:
    	 account.checkBalance();
    	 break;
    	 
     case 4:
    	 System.out.println("You are Exited");
    	 break;
     
     default:
    	 System.out.println("Invalid Choice");
    	 
    	 
     } 
   
     }
	}
	

}

package oopPractice;

public class BankAccount {
   private String accNum;
   private String accHolderName;
   private double balance;
   
   BankAccount(String accNum,String accHolderName,double balance) {
	   this.setAccNum(accNum);
	   this.setAccHolderName(accHolderName);
	   this.setBalance(balance);
	   
   }
     //getter();
   public String getAccNum() {
	   return accNum;
   }
   public String getAccHolderName() {
	   return accHolderName;
   }
   public double getBalance() {
	   return balance;
   }
     //setter();
   public void setAccNum(String accNum) {
	   this.accNum=accNum;
   }
   public void setAccHolderName(String accHolderName) {
	   this.accHolderName=accHolderName;
   }
   public void setBalance(double balance) {
	   this.balance=balance;
   }
   
   //check balance method
   
   public void checkBalance() {
	   System.out.println("Balance: "+this.getBalance());
   }
   
   //deposit method
   
   public void deposit(double depositAmount) {
	   this.setBalance(this.getBalance()+depositAmount);
	   System.out.println("You deposited "+depositAmount+"\n"+"Total Balance: "+this.getBalance());
   }
   
   //withdraw method
   
   public void withdraw(double withdrawAmount) {
	   if(this.getBalance()>=withdrawAmount) {
		   this.setBalance(this.getBalance()-withdrawAmount);
		   System.out.println("Your balance is: "+this.getBalance());
	   }
	   else {
		   System.out.println("Insufficient Funnds\nWithdraw cannot be completed");
	   }
   }
   
}

package oopPractice;

public class SavingsAccount extends BankAccount{
    private double profit;
    SavingsAccount(String accNum,String accHolderName,double balance,double profit) {
    	super(accNum,accHolderName,balance);
    	this.profit=profit;
    }
    
    public double profit() {
    	return this.getBalance()*(profit/100.0);
    }
    public void finalBalance() {
    	double profitEarned=profit();
    	this.setBalance(this.getBalance()+profitEarned);
    	//System.out.println("Balance: "+this.getBalance());
    }
}

package oopPractice;

public class CurrentAccount extends BankAccount {
    private double overDraftlimit;
    
    CurrentAccount(String accNum,String accHolderName,double balance,double overDraftLimit) {
    	super(accNum,accHolderName,balance);
    	this.overDraftlimit=overDraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= (this.getBalance() + this.overDraftlimit)) {
            if (amount <= this.getBalance()) {
                this.setBalance(this.getBalance() - amount);
                System.out.println("Your balance is: " + this.getBalance());
            } else {
                double remainingAmount = amount - this.getBalance();
                this.overDraftlimit=this.overDraftlimit- remainingAmount;
                this.setBalance(remainingAmount);
                System.out.println("Remaining amount is " + this.getBalance());
            }
        } else {
            System.out.println("Insufficient funds. Withdrawal cannot be completed.");
        }
    }
}
