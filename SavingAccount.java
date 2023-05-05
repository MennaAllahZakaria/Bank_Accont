//         اللهم لا سهل الا ما جعلته سهلا و انت تجعل الصعب ان شئت سهل        


package com.mycompany.bank_accont;

/**
 *
 * @author Menna Zakaria
 */
public class SavingAccount extends Account{

    public double amount;
    public SavingAccount() {
    super();
    }

    public SavingAccount(int Acount_id, double balance) {
        super(Acount_id, balance);
    }

    /**
     *
     * @param amount
     */
    @Override
  public void withdraw(double amount){
    if((balance-amount)>=0) {
      balance-=amount;    
      } 

  }

    public double getAmount() {
        return amount;
    }
  
    
}
        
    
    

