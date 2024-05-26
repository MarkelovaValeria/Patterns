package CodeSmells.newLab6.part1.moveMethod;

public class Account {
    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
