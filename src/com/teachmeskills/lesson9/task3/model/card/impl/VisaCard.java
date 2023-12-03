package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;

import static com.teachmeskills.lesson9.task3.model.constant.ILimit.VISA_CARD;

public class VisaCard extends BasicCard {

    public VisaCard() {
        currency = "USD";
        commissionPercentage = 0.10;
    }
    public int getTransferLimit(){
        return VISA_CARD;
    }

}
