package bank.bankProject.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Account")
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "balance")
    private double balance;
    @ManyToOne
    @JoinColumn(name = "bank_client_id")
    private BankClient bankClient;

    @OneToMany(mappedBy = "fromAccount", cascade = CascadeType.ALL)
    private List<Transactions> outgoingTransactions;

    @OneToMany(mappedBy = "toAccount", cascade = CascadeType.ALL)
    private List<Transactions> incomingTransactions;

    public Account(String accountNumber, double balance, BankClient bankClient) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankClient = bankClient;
        this.outgoingTransactions = new ArrayList<>();
        this.incomingTransactions = new ArrayList<>();
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public List<Transactions> getOutgoingTransactions() {
        return outgoingTransactions;
    }

    public void setOutgoingTransactions(List<Transactions> outgoingTransactions) {
        this.outgoingTransactions = outgoingTransactions;
    }

    public List<Transactions> getIncomingTransactions() {
        return incomingTransactions;
    }

    public void setIncomingTransactions(List<Transactions> incomingTransactions) {
        this.incomingTransactions = incomingTransactions;
    }
}
