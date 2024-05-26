package CodeSmells.newLab6.part4.separateQueryFromModifier;

public class Account4 {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void applyCimmission(){
        double commission = 0.05;
        balance -= balance*commission;
    }
}
