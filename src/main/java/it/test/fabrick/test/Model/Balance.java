package it.test.fabrick.test.Model;

/*
    {
  "date": "2018-08-17",
  "balance": 29.64,
  "availableBalance": 29.64,
  "currency": "EUR"
}
     */
public class Balance {
    private String date;
    private double balance;
    private double availableBalance;
    private String currency;

    public Balance() {
    }

    public Balance(String date, double balance, double availableBalance, String currency) {
        this.date = date;
        this.balance = balance;
        this.availableBalance = availableBalance;
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "date='" + date + '\'' +
                ", balance=" + balance +
                ", availableBalance=" + availableBalance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
