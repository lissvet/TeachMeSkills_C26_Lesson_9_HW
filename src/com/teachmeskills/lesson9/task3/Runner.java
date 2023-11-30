package com.teachmeskills.lesson9.task3;

import com.teachmeskills.lesson9.task3.card.BasicCard;
import com.teachmeskills.lesson9.task3.card.BelCard;
import com.teachmeskills.lesson9.task3.card.MasterCard;
import com.teachmeskills.lesson9.task3.card.VisaCard;
import com.teachmeskills.lesson9.task3.client.Address;
import com.teachmeskills.lesson9.task3.client.Client;
import java.util.Scanner;
/**Create a program to transfer from one customer's bank card to his other card.
 * The data for the transfer is set from the console.
 * The system stores information about the name, surname, passport number, date of birth of the client.
 * As well as his postal code, country, city, street and house number.
 * Make a method to transfer the amount from one krata to another.
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
        System.out.println("Enter your country: ");
        address.country = scan.nextLine();
        System.out.println("Enter your city: ");
        address.city = scan.nextLine();
        System.out.println("Enter your street: ");
        address.street = scan.nextLine();
        System.out.println("Enter your house number: ");
        address.houseNumber = scan.nextLine();
        System.out.println("Enter your postal code: ");
        address.postalCode = scan.nextLine();

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scan.nextLine();
        System.out.println("Enter your passport number: ");
        String passportNumber = scan.nextLine();
        System.out.println("Enter your date of birth: ");
        String dateOfBirth = scan.nextLine();
        Client client = new Client(name, surname, passportNumber, dateOfBirth, address);

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
                    System.out.println("Set CVV: ");
                    int cvv = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv);

                    System.out.println("Enter card id: ");
                    client.cards[i].id = scan.nextLong();

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    break;
                case "MasterCard":
                    client.cards[i] = new MasterCard();
                    System.out.println("Set CVV: ");
                    int cvv2 = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv2);

                    System.out.println("Enter card id: ");
                    client.cards[i].id = scan.nextLong();

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    break;
                case "VisaCard":
                    client.cards[i] = new VisaCard();
                    System.out.println("Set CVV: ");
                    int cvv3 = scan.nextInt();
                    scan.nextLine();
                    client.cards[i].setCvv(cvv3);

                    System.out.println("Enter card id: ");
                    client.cards[i].id = scan.nextLong();

                    System.out.println("Enter amount: ");
                    client.cards[i].setCurrentAmount(scan.nextInt());
                    scan.nextLine();
                    break;
                default:
                    System.out.println("Incorrect card type. Please enter BelCard, MasterCard, or VisaCard.");
                    i--;
            }
        }

        System.out.println("Enter the card Id you want to transfer from (Limits: BelCard (1000), MasterCard(500), VisaCard(800)):");
        BasicCard card1 = client.getCardById(scan.nextLong());
        System.out.println("Enter the card Id you want to transfer to:");
        BasicCard card2 = client.getCardById(scan.nextLong());
        System.out.println("Enter the transfer amount:");
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
