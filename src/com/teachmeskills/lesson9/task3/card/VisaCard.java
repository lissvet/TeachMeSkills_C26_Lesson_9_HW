package com.teachmeskills.lesson9.task3.card;

import static com.teachmeskills.lesson9.task3.constant.ILimit.VISA_CARD;

public class VisaCard extends BasicCard{

    public VisaCard() {
        currency = "USD";
        commissionPercentage = 0.10;
    }
    public int getTransferLimit(){
        return VISA_CARD;
    }

}
