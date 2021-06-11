package lab14;

import java.io.Serializable;

public class Account implements Serializable {
    private String name, accountNumber;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public boolean withdraw(int amount){
        if(balance>amount){
            balance-=amount;
            System.out.println(amount+" was withdrew ! Current balance is "+ balance);
            return  true;}
        else  System.out.println("Not enough balance to withdraw amount "+ amount);
            return false;

    }
    public void deposit(int amount){
            balance+=amount;
            System.out.println(amount+" was added to the balance! Current balance is "+ balance);
             }
    public boolean transfer(Account transferTo, int amount){
        if(balance>amount)  {
            balance-=amount; transferTo.balance+=amount;
            System.out.println(amount+" amount was transferred to "+transferTo.accountNumber+" from "+this.accountNumber);
            return true;}
        else System.out.println("Not enough balance in account number "+ this.accountNumber+" to carry out the transfer!");
            return  false;}
    public void balanceInquire(){
        System.out.println("Balance of "+this.accountNumber+" is "+ this.balance);

    }


}
