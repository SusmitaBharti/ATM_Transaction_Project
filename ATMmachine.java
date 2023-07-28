package atm;

import java.util.Scanner;

public class ATMmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int balance=5000,Withdraw,Deposit;
      Scanner sc=new Scanner(System.in);
      System.out.println("Welcome to Atm Machine");
      System.out.print("enter your choice:");
      int choice=sc.nextInt();
      while(true) {
    	System.out.println("choose 1 for Withdraw");
    	System.out.println("choose 2 for Deposit");
	    System.out.println("choose 3 for checkBalance");
	    System.out.println("choose 1 for EXIT");
        System.out.println("choose the operation what you want:");
          int n=sc.nextInt();
          switch(n){
          case 1: System.out.println("enter money to be withdrawn:");
               Withdraw=sc.nextInt();
                  if(balance >=Withdraw) {
            	             balance-=Withdraw;
            	         System.out.println("collect your money");
                  }
            	  else {
            		  System.out.println("Insufficient money");
            	  }
                  System.out.println("");
                  break;
          case 2: System.out.println("enter money to be deposited:");
                        Deposit=sc.nextInt();
                  balance=balance+Deposit;
                  System.out.println("your money successfully Deposited"+" " +balance);
                  System.out.println(" ");
                  break;
          case 3: System.out.println(" Check Balance" +" " +balance);
                  System.out.println("");
                  break;
          case 4: System.out.println("Exit to ATM Machine");       
                  
            	  
            	  
              }
          
        	  
	         
	         
    	         
    	  }
      }
      
	}

