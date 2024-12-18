package Entity;

import Utility.AccountNumberGenerator;

import java.math.BigDecimal;

public class Account {

    private int accountNumber;
    private Patient user;
    private BigDecimal fees;
    private String feesPaid;

    public Account(String name, BigDecimal amount) {
        this.accountNumber = AccountNumberGenerator.getAccountNumber();
        this.user = new Patient(name);
        this.fees = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Patient getUser() {
        return user;
    }

    public void setUser(Patient user) {
        this.user = user;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public String getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(String feesPaid) {
        this.feesPaid = feesPaid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", user=" + user +
                ", fees=" + fees +
                ", feesPaid='" + feesPaid + '\'' +
                '}';
    }
}
