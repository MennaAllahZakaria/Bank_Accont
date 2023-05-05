//         اللهم لا سهل الا ما جعلته سهلا و انت تجعل الصعب ان شئت سهل        

package com.mycompany.bank_accont;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Menna Zakaria
 */
public class Bank_accont {

    public static void main(String[] args) throws FileNotFoundException {
       Scanner sc=new Scanner(System.in);  
 char choice='y';
 while ( choice=='y'){
    
      System.out.println("Please enter your name ");
     String name = sc.nextLine();
      System.out.println("Please enter your Accont id ");
     int id=sc.nextInt();
       System.out.println("Please enter your balance ");
     double balance=sc.nextDouble();
      System.out.println("Please enter AnnualInterestRate ");
     double AnnualInterestRate=sc.nextDouble();
     
      Account c=new Account(name ,id,balance,AnnualInterestRate);
    
      
      char ent='y';
     while ( ent=='y'){
            System.out.println("1) Saving account ");
            System.out.println("2) Checking account ");
            int ch_s_c=sc.nextInt();
            if ( ch_s_c==1){
                
     System.out.println("Saving Account: ");
    SavingAccount s=new SavingAccount(id,balance);
    char save='y';
    while ( save=='y'){
       
       System.out.println("\nCurrent blance ="+s.getBalance());
       
       System.out.println("d ) deposit");
       System.out.println("W ) withdraw");
       char d_w= sc.next().charAt(0);
      System.out.println("Please Enter the amount");
      double amount=sc.nextDouble();
      if ( d_w=='d') s.deposit(amount);
      else s.withdraw(amount);
      
   
    if((s.getBalance()-s.getAmount())<0){
           System.out.println("Invalid Transaction:( Current balance = "+s.getBalance()+")");
      } 
    
        System.out.println("Want to countinue..... (y/n)");
        save=sc.next().charAt(0);
    }
    
                
            System.out.println("\n____________________________________________");     
                
            }else{
                
                
               
     System.out.println("Checking Account: ");
  CheckingAccount c1=new CheckingAccount(1000,id,balance);
    char check='y';
    while ( check=='y'){
       
       System.out.println("\nCurrent blance ="+c1.getBalance());
       
       System.out.println("d ) deposit");
       System.out.println("W ) withdraw");
       char d_w= sc.next().charAt(0);
      System.out.println("Please Enter the amount");
      double amount=sc.nextDouble();
      if ( d_w=='d') c1.deposit(amount);
      else c1.withdraw(amount);
      
   
    if((c1.getBalance()-c1.getAmount())<0){
           System.out.println("Invalid Transaction:( Current balance = "+c1.getBalance()+")");
      } else{
         System.out.println("\nCurrent blance after operation ="+c1.getBalance());
    }
     System.out.println("\n____________________________________________");
        System.out.println("Want to countinue..... (y/n)");
        check=sc.next().charAt(0);
    }
    
             
                
               
            }

      System.out.println("Are you want to countinue ... (y/n)");
                ent=sc.next().charAt(0);
                 
     
     } 
     System.out.println("Anather person  (y/n)");
     choice =sc.next().charAt(0);
 
 }
    }
}
