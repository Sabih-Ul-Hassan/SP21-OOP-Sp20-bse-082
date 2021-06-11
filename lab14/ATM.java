package lab14;

import java.io.*;
import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accounts;

    public ATM() { this.accounts = new ArrayList<Account>(); }

    public void addAccount(Account a){
        if(accounts.size()>0) for (Account acc: accounts) {
            if(acc.getAccountNumber().equals(a.getAccountNumber())){
                System.out.println("Account number already exists");
                return;
            }
        }
       accounts.add(a); updateFile();
    }
    public boolean deleteAccount(Account a)
    {
        for(Account acc:accounts) {
            if(acc.equals(a)){
                boolean value= accounts.remove(a); updateFile(); return value;
            }
    }
        return false;
}
    public boolean withdraw(String accountNumber,int amount){
        for (Account acc:accounts) {
            if(acc.getAccountNumber().equals(accountNumber)) {
               boolean value = acc.withdraw(amount) ; updateFile(); return value;
            }
        }
        return false;
    }
    public boolean deposit(String accountNumber,int amount){
        for (Account acc:accounts) {
            if(acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount); updateFile(); return true;
            }
        }
        return false;
    }
    public boolean transfer(String accountNumberTransferFrom,String accountNumberTransferTo, int amount) {
        Account to=null,from=null;
        boolean toExists=false,fromExists=false;
        for (Account a:accounts) {
            if(a.getAccountNumber().equals(accountNumberTransferFrom)) {
                fromExists=true; from = a;
            } else if(a.getAccountNumber().equals(accountNumberTransferTo)) {
                toExists=true; to = a;
            }
        }
        if(! (toExists && fromExists)) return false;
         boolean value = from.transfer(to,amount); updateFile(); return value;
    }
    public void balanceInquire(String accountNumber){
        for (Account acc:accounts) {
            if(acc.getAccountNumber().equals(accountNumber)) {
                acc.balanceInquire(); return;
            }
        }}
    private void updateFile() {
        ObjectOutputStream s;
        try {
            s = new ObjectOutputStream( new FileOutputStream("file.txt"));
            s.writeObject(this.accounts);
        } catch (IOException e) {
            System.out.println("File didn't get saved because of error "+e.getMessage());;
        }
        System.out.println("Changes saved to file!");
    }
    public void loadData() {
        ObjectInputStream s;
        try {
            s = new ObjectInputStream(new FileInputStream("data.txt"));
            try {
                this.accounts= (ArrayList<Account>) s.readObject();


            } catch (ClassNotFoundException e) {
                this.accounts = new ArrayList<Account>();
            }
        } catch (IOException e) {
            this.accounts = new ArrayList<Account>();
        }
    }



}
