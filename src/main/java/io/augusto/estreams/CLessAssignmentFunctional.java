package io.augusto.estreams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.augusto.estreams.Loyalty.*;

public class CLessAssignmentFunctional {

    public static void main(String[] args) {

        //List of customers
        List<DImmutableCustomer> customers = DImmutableCustomer.customers();

        //We need to return a List with the email of the PRIME customers
        List<String> primes = emailsByPredicate(customers, cust -> PRIME.equals(cust.getLoyalty()));
        sendPromotion(primes, "20% + 10 % Off");

        //We need to send a promotion via email to PLATINUM or GOLD customers
        List<String> platinumOrGolds = emailsByPredicate(customers, cust -> PLATINUM.equals(cust.getLoyalty()) || GOLD.equals(cust.getLoyalty()));
        sendPromotion(platinumOrGolds, "20% + 10 % Off");

        //We need to send a promotion BASIC customers
        List<String> basics = emailsByPredicate(customers, cust -> BASIC.equals(cust.getLoyalty()));
        sendPromotion(basics, "Free shipping on selected products");

        //If we assign predicate to variables, we can compose predicates.
        Predicate<DImmutableCustomer> primesPred = cust -> PRIME.equals(cust.getLoyalty());
        Predicate<DImmutableCustomer> activesPred = DImmutableCustomer::isActive;
        List<String> activePrimes = emailsByPredicate(customers, primesPred.and(activesPred));
        sendPromotion(activePrimes, "Free, 1 month trial of GOLD benefits");
    }

    private static List<String> emailsByPredicate(List<DImmutableCustomer> customers, Predicate<DImmutableCustomer> loyaltyCombination) {
        return customers.stream()
                .filter(loyaltyCombination)
                .map(DImmutableCustomer::getEmail)
                .collect(Collectors.toList());
    }

    private static void sendPromotion(List<String> emails, String promotion) {
        System.out.print("Sending promotion: " + promotion + " to:");
        System.out.println(emails);
    }
}
