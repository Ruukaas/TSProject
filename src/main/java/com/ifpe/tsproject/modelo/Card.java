package com.ifpe.tsproject.modelo;

public class Card {

    private String ownerName;
    private String CardCvv;
    private String UserCPF;
    private String CardNumber;
    private String ExpirationDate;
    private String cardType;

    public Card(String CardCvv, String cardType, String UserCPF , String ownerName, String CardNumber, String ExpirationDate) {
        this.CardCvv = CardCvv;
        this.ownerName = ownerName;
        this.UserCPF = UserCPF;
        this.CardNumber = CardNumber;
        this.ExpirationDate = ExpirationDate;
        this.cardType = cardType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardCvv() {
        return CardCvv;
    }

    public void setCardCvv(String CardCvv) {
        this.CardCvv = CardCvv;
    }

    public String getUserCPF() {
        return UserCPF;
    }

    public void setUserCPF(String UserCPF) {
        this.UserCPF = UserCPF;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }



}