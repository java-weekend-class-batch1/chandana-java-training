package com.training.Encapsulationassgn;



class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Secure {

    private String accountNumber;
    private String ownerName;
    private double balance;
    public Secure(String accNo, String owner, double balance) {
        this.accountNumber = accNo;
        this.ownerName = owner;

        if (balance < 0) {
            System.out.println("Invalid initial balance!");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        balance += amount;
        log("Deposited: " + amount);
    }

    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
            return;
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }

        balance -= amount;
        log("Withdrawn: " + amount);
    }

   
    protected void log(String message) {
        System.out.println("[LOG] " + message + " | Balance: " + balance);
    }
}

public class SecureAccount {
    public static void main(String[] args) {

        Secure acc = new Secure("27", "Chandana", 1000);

        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Owner: " + acc.getOwnerName());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(500);

        try {
            acc.withdraw(200);
            acc.withdraw(2000); 
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}