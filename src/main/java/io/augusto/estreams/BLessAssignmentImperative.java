package io.augusto.estreams;

import java.util.ArrayList;
import java.util.List;

import static io.augusto.estreams.Loyalty.BASIC;
import static io.augusto.estreams.Loyalty.GOLD;
import static io.augusto.estreams.Loyalty.PLATINUM;

/**
 * Sending promotion to customers according to DImmutableCustomer'loyalty
 */
public class BLessAssignmentImperative {

    public static void main(String[] args) {

        //List of customers
        List<DImmutableCustomer> customers = DImmutableCustomer.customers();

        //We need to send a promotion via email to PRIME customers
        List<String> primeEmails = emailsByLoyalty(customers, Loyalty.PRIME);
        sendPromotion(primeEmails, "20% + 10 % Off");

        //We need to send a promotion via email to PLATINUM or GOLD customers
        //Creating a method for each comparison condition is a bad approach. Method proliferation
        List<String> platinumOrGoldEmails = platinumOrGoldEmails(customers, PLATINUM, Loyalty.GOLD);
        sendPromotion(platinumOrGoldEmails, "40% + 10 % Off + Free shipping");

        //Do we need to write a method for each combination of loyalty programs?
        //Java 1.1 anonymous class to rescue

        LoyaltyCombination platinumOrGoldCombination = new LoyaltyCombination() {
            @Override
            public boolean evaluate(DImmutableCustomer customer) {
                return PLATINUM.equals(customer.getLoyalty()) || GOLD.equals(customer.getLoyalty());
            }
        };
        List<String> goldOrSilverEmails = emailsUsingAnonymousClasses(customers, platinumOrGoldCombination);
        sendPromotion(goldOrSilverEmails, "30% + 5 % Off + Free shipping");

        LoyaltyCombination basicEmailsCombination = new LoyaltyCombination() {
            @Override
            public boolean evaluate(DImmutableCustomer customer) {
                return BASIC.equals(customer.getLoyalty());
            }
        };

        List<String> basicEmails = emailsUsingAnonymousClasses(customers, basicEmailsCombination);
        sendPromotion(basicEmails, "Free shipping on selected products");

        //It's still verbose. Let's look at the functional approach
    }

    private static List<String> emailsByLoyalty(List<DImmutableCustomer> customers, Loyalty loyalty) {
        List<String> emails = new ArrayList<>(); //Assignment
        for (DImmutableCustomer customer : customers) { //One assignment each iteration
            if (loyalty.equals(customer.getLoyalty())) {
                emails.add(customer.getEmail()); //Mutating list
            }
        }
        return emails;
    }

    //One method for each comparison condition is a bad approach. Method proliferation
    private static List<String> platinumOrGoldEmails(List<DImmutableCustomer> customers, Loyalty loyalty1, Loyalty loyalty2) {
        List<String> emails = new ArrayList<>();
        for (DImmutableCustomer customer : customers) {
            //The equal condition may not be the same all the time
            if (loyalty1.equals(customer.getLoyalty()) || loyalty2.equals(customer.getLoyalty())) {
                emails.add(customer.getEmail());
            }
        }
        return emails;
    }

    private static List<String> emailsUsingAnonymousClasses(List<DImmutableCustomer> customers, LoyaltyCombination combination) {
        List<String> emails = new ArrayList<>();
        for (DImmutableCustomer customer : customers) {
            if (combination.evaluate(customer)) {
                emails.add(customer.getEmail());
            }
        }
        return emails;
    }

    private static void sendPromotion(List<String> emails, String promotion) {
        System.out.print("Sending promotion: " + promotion + " to:");
        System.out.println(emails);
    }
}
