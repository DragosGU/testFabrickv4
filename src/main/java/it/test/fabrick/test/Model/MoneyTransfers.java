package it.test.fabrick.test.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

/*
"transactionId": "1839162887001",
                "operationId": "21000183159811",
                "accountingDate": "2021-10-29",
                "valueDate": "2021-10-29",
                "type": {
                    "enumeration": "GBS_TRANSACTION_TYPE",
                    "value": "GBS_ACCOUNT_TRANSACTION_TYPE_0010"
                },
                "amount": 4.24,
                "currency": "EUR",
                "description": "BD PROVAB INTERNET       DA 03268.22300         Data Ordine 29102021 REMITINFO"
            },
 */
public class MoneyTransfers {
    private Long operationId;
    private String accountingDate;
    private String valueDate;
    private String type;
    private String amount;
    private String currency;
    private String description;

    public MoneyTransfers() {
    }

    public MoneyTransfers(Long operationId, String description) {
        this.operationId = operationId;
        this.description = description;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MoneyTransfers{" +
                "operationId=" + operationId +
                ", accountingDate='" + accountingDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


