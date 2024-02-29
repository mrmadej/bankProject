package bank.bankProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Current_account")
public class CurrentAccount extends Account{
    @Column(name = "overdraft_limit")
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, BankClient bankClient, double overdraftLimit) {
        super(accountNumber, balance, bankClient);
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount() {

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
