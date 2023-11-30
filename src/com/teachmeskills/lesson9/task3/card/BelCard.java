package com.teachmeskills.lesson9.task3.card;

import static com.teachmeskills.lesson9.task3.constant.ILimit.BEL_CARD_LIMIT;

public class BelCard extends BasicCard{

    public BelCard() {
        currency = "BYN";
        commissionPercentage = 0.03;
    }

    public int getTransferLimit(){
        return BEL_CARD_LIMIT;
    }

}
