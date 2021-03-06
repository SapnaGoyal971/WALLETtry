package com.example.demo.Classes;

import javax.persistence.*;

@Embeddable
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long txnID;

    private long amount;
    private long payerPhoneNumber;
    private long payeePhoneNumber;
    private Status status;
    public enum Status{
        SUCCESS,FAILURE
    }
    public Transaction(){}
    public Transaction(Long payeePhoneNumber, Long payerPhoneNumber, Long amount) {
        this.payeePhoneNumber=payeePhoneNumber;
        this.payerPhoneNumber=payerPhoneNumber;
        this.amount=amount;
    }


    public long getTxnID() {
        return txnID;
    }

    public void setTxnID(long txnID) {
        this.txnID = txnID;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getPayerPhoneNumber() {
        return payerPhoneNumber;
    }

    public void setPayerPhoneNumber(long payerPhoneNumber) {
        this.payerPhoneNumber = payerPhoneNumber;
    }

    public long getPayeePhoneNumber() {
        return payeePhoneNumber;
    }

    public void setPayeePhoneNumber(long payeePhoneNumber) {
        this.payeePhoneNumber = payeePhoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
