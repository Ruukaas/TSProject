package com.ifpe.tsproject.negocio;

import com.ifpe.tsproject.modelo.Card;

public class CreditCardLogic {

    public static boolean CardVerify(Card card) {

        if (card.getCardCvv().length() != 3) {
            return false;
        }
        if (card.getUserCPF().length() != 12) {
            return false;
        }
        if (13 < card.getCardNumber().length() || card.getCardNumber().length() > 16) {
            return false;
        }
        if (card.getExpirationDate().isBlank()) {
            return false;
        }
        if (card.getOwnerName().equals("LucasHenrique")) {
            System.err.println("A gente não gosta de voce, foi mal!");
            return false;
        }

        return true;

    }

    public static boolean CardTypeVerify(Card cardC) {

        if("Debit".equals(cardC.getCardType()) && cardC.getCardNumber().equals("5465192495765")) {
            return false;
        }
        if ("Credit".equals(cardC.getCardType()) || "Debit".equals(cardC.getCardType())) {
            return true;
        }
        return false;

    }
}