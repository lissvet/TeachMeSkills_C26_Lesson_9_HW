package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;

import static com.teachmeskills.lesson9.task3.model.constant.ILimit.BEL_CARD_LIMIT;

public class BelCard extends BasicCard {

    public BelCard() {
        currency = "BYN";
        commissionPercentage = 0.03;
    }

    public int getTransferLimit(){
        return BEL_CARD_LIMIT;
    }

}
