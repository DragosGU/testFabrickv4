package it.test.fabrick.test.Model;


import java.util.HashSet;
import java.util.Set;


public class User {
    private String name;
    private Long id;

    private BankAccount account;
    private Set<MoneyTransfers> transfers = new HashSet<MoneyTransfers>(0);

    public User() {
    }

    public User(String name, Long id, BankAccount account, Set<MoneyTransfers> transfers) {
        this.name = name;
        this.id = id;
        this.account = account;
        this.transfers = transfers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public Set<MoneyTransfers> getTransfers() {
        return transfers;
    }

    public void setTransfers(Set<MoneyTransfers> transfers) {
        this.transfers = transfers;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", account=" + account +
                '}';
    }
}
