//         اللهم لا سهل الا ما جعلته سهلا و انت تجعل الصعب ان شئت سهل        

package com.mycompany.bank_accont;

/**
 *
 * @author Menna Zakaria
 */

public class CheckingAccount extends Account{
   public double overdraftlimit; //حد السحب   
    public double amount;
    public CheckingAccount(double overdraftlimit, int Acount_id, double balance) {
        super(Acount_id, balance);
        this.overdraftlimit = overdraftlimit;
    }

    public CheckingAccount(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

  
   @Override
   public void withdraw(double amount){
     
        if((balance-amount+overdraftlimit)>=0) {
      balance-=amount;    
      }
   
    }

    public double getAmount() {
        return amount;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }
   
}
