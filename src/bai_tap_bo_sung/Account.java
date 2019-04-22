package bai_tap_bo_sung;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualIterestRate;
    private Date dateCreated=new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualIterestRate() {
        return annualIterestRate;
    }

    public void setAnnualIterestRate(double annualIterestRate) {
        this.annualIterestRate = annualIterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualIterestRate/12/100;

    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public double withdraw(double value){
        double balance= (getBalance()-value);
        this.setBalance(balance);
        return balance;
    }
    public double deposit(double value){
        double balance= (getBalance()+value);
        this.setBalance(balance);
        return balance;
    }
}
