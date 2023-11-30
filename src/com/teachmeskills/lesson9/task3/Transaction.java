package com.teachmeskills.lesson9.task3;

import com.teachmeskills.lesson9.task3.card.BasicCard;

import java.util.Objects;

import static com.teachmeskills.lesson9.task3.constant.IConst.BYN_TO_USD;
import static com.teachmeskills.lesson9.task3.constant.IConst.USD_TO_BYN;

public class Transaction {

    public static void transferFromCardToCard(BasicCard one, BasicCard two, double sum){
        if(sum < 5){
            System.out.println("Enter correct transfer amount");
            return;
        }

        if (sum > one.getTransferLimit()){
            System.out.println("limit exceeded");
        } else {
            one.setCurrentAmount(one.getCurrentAmount() - sum - (sum * one.commissionPercentage));
            if(Objects.equals(one.currency, "BYN") && !Objects.equals(two.currency, "BYN")){
                sum *= BYN_TO_USD;
            } else if (Objects.equals(one.currency, "USD") && !Objects.equals(two.currency, "USD")) {
                sum *= USD_TO_BYN;
            }
            two.setCurrentAmount(two.getCurrentAmount() + sum);
        }
    }

}
