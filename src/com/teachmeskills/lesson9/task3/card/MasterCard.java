package com.teachmeskills.lesson9.task3.card;

import static com.teachmeskills.lesson9.task3.constant.ILimit.BEL_CARD_LIMIT;
import static com.teachmeskills.lesson9.task3.constant.ILimit.MASTER_CARD_LIMIT;

public class MasterCard extends BasicCard{

    public MasterCard() {
        currency = "USD";
        commissionPercentage = 0.05;
    }

    public int getTransferLimit(){
        return MASTER_CARD_LIMIT;
    }

}
