package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;

import static com.teachmeskills.lesson9.task3.model.constant.ILimit.MASTER_CARD_LIMIT;

public class MasterCard extends BasicCard {

    public MasterCard() {
        currency = "USD";
        commissionPercentage = 0.05;
    }

    public int getTransferLimit(){
        return MASTER_CARD_LIMIT;
    }

}
