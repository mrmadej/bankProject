package bank.bankProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Savings_account")
public class SavingsAccount extends Account{
    @Column(name = "interest_rate")
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, BankClient bankClient, double interestRate) {
        super(accountNumber, balance, bankClient);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
        super();
    }
}
