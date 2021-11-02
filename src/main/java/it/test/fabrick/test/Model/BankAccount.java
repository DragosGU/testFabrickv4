package it.test.fabrick.test.Model;

public class BankAccount {
    private Long accountId;
    private String currency;
    private String balance;

    private User user;

    public BankAccount() {
    }

    public BankAccount(Long accountId, String currency, String balance, User user) {
        this.accountId = accountId;
        this.currency = currency;
        this.balance = balance;
        this.user = user;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", currency='" + currency + '\'' +
                ", balance='" + balance + '\'' +
                ", user=" + user +
                '}';
    }
}
