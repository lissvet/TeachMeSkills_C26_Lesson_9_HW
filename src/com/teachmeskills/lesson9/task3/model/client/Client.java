package com.teachmeskills.lesson9.task3.model.client;

import com.teachmeskills.lesson9.task3.model.address.Address;
import com.teachmeskills.lesson9.task3.model.card.BasicCard;

public class Client {
    public String name;
    public String surname;
    public String passportNumber;
    public String dateBirth;
    public Address address;
    public BasicCard[] cards;

    public Client(String name, String surname, String passportNumber, String dateBirth, Address address) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.dateBirth = dateBirth;
        this.address = address;
    }

    public BasicCard getCardById(long cardId){
        for(BasicCard card : this.cards){
            if (card.getId() == cardId){
                return card;
            }
        }
        return null;
    }

}
