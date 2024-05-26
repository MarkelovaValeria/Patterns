package CodeSmells.newLab6.part1.moveMethod;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts){
        this.accounts = accounts;
    }
    public void calculateInterest(Account account){
            double interest =  account.getBalance()*account.getInterestRate() / 100;
            System.out.println("Interest account - " + interest);
    }
    public void processAccounts(){
        for (Account account:accounts){
            calculateInterest(account);
        }
    }
}
