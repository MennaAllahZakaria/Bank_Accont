//         اللهم لا سهل الا ما جعلته سهلا و انت تجعل الصعب ان شئت سهل        

package com.mycompany.bank_accont;

/**
 *
 * @author Menna Zakaria
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Account {
       private String Costemer_Name;
    private int  Acount_id;
    protected double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private  ArrayList<Transaction> trasactions =new ArrayList<Transaction>() ;
    
      
    public Account() {
      Costemer_Name="";
    Acount_id=0;
     balance=0;
    annualInterestRate=0;
    dateCreated=new Date();  
    }

    public Account(int Acount_id, double balance) {
        this.Acount_id = Acount_id;
        this.balance = balance;
        dateCreated=new Date(); 
    }

    public Account(String Costemer_Name, int Acount_id, double balance, double annualInterestRate) {
        this.Costemer_Name = Costemer_Name;
        this.Acount_id = Acount_id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated=new Date(); 
    }

    public Account(int Acount_id) {
        this.Acount_id = Acount_id;
        dateCreated=new Date(); 
    }
   

    public void deposit (double amount){
     
      Transaction t=new Transaction('D',amount,new Date());
      trasactions.add(t);
       balance+=amount;
    }
      public void withdraw (double amount){
         if(balance<amount){
         System.out.println(" Invalid ");
         
         }
          
          else{
         Transaction t=new Transaction('W',amount,new Date());
          trasactions.add(t);   
           balance-=amount;
         }
        
        
    }

    public String getCostemer_Name() {
        return Costemer_Name;
    }

    public int getAcount_id() {
        return Acount_id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTrasactions() {
        return trasactions;
    }
     
    public double getBalance() {
        return balance;
    }
    
    
  
}
