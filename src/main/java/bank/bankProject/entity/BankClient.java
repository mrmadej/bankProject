package bank.bankProject.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "BankClient")
public class BankClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @OneToMany(mappedBy = "bankClient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Account> accounts;
    @Column(name = "mail")
    private String mail;
    @Column(name = "phone")
    private String phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @Column(name = "pesel")
    private int pesel;
    @Column(name = "user_identificator")
    private String userIdentificator;
    @Column(name = "password")
    private String password;

    public BankClient() {}
    public BankClient(String name, String surname, List<Account> accounts, String mail, String phone, Address address, int pesel, String userIdentificator, String password) {
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.pesel = pesel;
        this.userIdentificator = userIdentificator;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getUserIdentificator() {
        return userIdentificator;
    }

    public void setUserIdentificator(String userIdentificator) {
        this.userIdentificator = userIdentificator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
