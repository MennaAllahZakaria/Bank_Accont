//         اللهم لا سهل الا ما جعلته سهلا و انت تجعل الصعب ان شئت سهل        

package com.mycompany.bank_accont;
/**
 *
 * @author Menna Zakaria
 */
import java.util.Date;
public class Transaction {
     public char transactionType;
    public double amount;
    public Date date;

    public Transaction(char transactionType, double amount, Date date) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }
    
}
