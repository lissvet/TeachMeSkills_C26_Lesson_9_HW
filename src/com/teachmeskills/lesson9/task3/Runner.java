package com.teachmeskills.lesson9.task3;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.task3.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.task3.model.card.impl.VisaCard;
import com.teachmeskills.lesson9.task3.model.address.Address;
import com.teachmeskills.lesson9.task3.model.client.Client;
import com.teachmeskills.lesson9.task3.service.Transaction;

import java.util.Scanner;
/**Create a program to transfer from one customer's bank card to his other card.
 * The data for the transfer is set from the console.
 * The system stores information about the name, surname, passport number, date of birth of the client.
 * As well as his postal code, country, city, street and house number.
 * Make a method to transfer the amount from one card to another.
 * Each card contains card number, CVC/CVV, current amount on the card, card code(id).
 * Cards can be of three types: BelCard, MasterCard, VisaCard.
 * There are limits for transfers. Limits are checked only for the card from which the transfer is made.
 * There are different limits for each type of card.
 * Cards can be in different currencies - therefore, provide for conversion.
 * A commission fee is charged for the transfer (set as a percentage).**/
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Address address = new Address();
        address.country = "Republic of Belarus";
        address.city = "Minsk";
        address.street = "Street";
        address.houseNumber = 21;
        address.postalCode = 1234567;

        Client client = new Client("Lisa", "Rogow", "in12345678", "13-02-2000", address);

        System.out.println("Enter how many cards you have: ");
        int cards = scan.nextInt();
        scan.nextLine();
        client.cards = new BasicCard[cards];

        for(int i = 0; i < client.cards.length; i++){
            System.out.println("Enter card " + (i+1) + " type (BelCard, MasterCard, VisaCard): ");
            String cardType = scan.nextLine();
            switch(cardType){
                case "BelCard":
                    client.cards[i] = new BelCard();
                    System.out.println("Set CVV (three digit number): ");
                    int cvv = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv);

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Id of this card: " + client.cards[i].getId());
                    break;
                case "MasterCard":
                    client.cards[i] = new MasterCard();
                    System.out.println("Set CVV (three digit number): ");
                    int cvv2 = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv2);

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Id of this card: " + client.cards[i].getId());
                    break;
                case "VisaCard":
                    client.cards[i] = new VisaCard();
                    System.out.println("Set CVV (three digit number): ");
                    int cvv3 = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv3);

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Id of this card: " + client.cards[i].getId());
                    break;
                default:
                    System.out.println("Incorrect card type. Please enter BelCard, MasterCard, or VisaCard.");
                    i--;
            }
        }

        System.out.println("Enter the card Id you want to transfer from ");
        BasicCard card1 = client.getCardById(scan.nextLong());
        System.out.println("Enter the card's CVV: ");
        int cardCvv = scan.nextInt();
        if(cardCvv != card1.getCvv()){
            System.out.println("Incorrect svv");
            return;
        }
        System.out.println("Enter the card Id you want to transfer to:");
        BasicCard card2 = client.getCardById(scan.nextLong());
        if (card1.getId() == card2.getId()){
            System.out.println("You can't make a transfer to a card with the same id");
            return;
        }
        System.out.println("Enter the transfer amount (Limits: BelCard (1000), MasterCard(500), VisaCard(800)):");
        int sum = scan.nextInt();

        System.out.println(client.name + " " + client.surname);
        System.out.println("Amount on the card1 before transfer: " + card1.getCurrentAmount());
        System.out.println("Amount on the card2 before transfer: " + card2.getCurrentAmount());

        Transaction.transferFromCardToCard(card1, card2, sum);

        System.out.println("Amount on the card1 after transfer: " + card1.getCurrentAmount());
        System.out.println("Amount on the card2 after transfer: " + card2.getCurrentAmount());
        System.out.println("Commission percentage: " + (card1.commissionPercentage * 100));
    }

}
