package io.augusto.cmethodreference;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BMethodRefenceTypes {

    public static void main(String[] args) {

        final Cart cart = new Cart();
        final BinaryOperator<Double> sumprices = (price1, price2) -> price1 + price2;

        //Sum cart total
        Integer total = itemsLoad().entrySet().stream()
                .map(Item::new)                         //To a constructor.
//                .peek(cart::addItem)                     //To an instance method of an existing object.
                .map(Item::getPrice)                    //To instance method of an object of a particular type.
                .map(BMethodRefenceTypes::applyDiscount) //To a static method
                .mapToInt(e -> e.intValue())
                .sum();

        System.out.println("Total is: " + total);
    }

    private static double applyDiscount(Integer price) {

        int discount = 0;
        switch (price) {
            case 10: discount = 10; break;
            case 20: discount = 20; break;
            case 100: discount = 30; break;
            case 200: discount = 40; break;
            case 1000: discount = 50; break;
            default: discount = 0; break;
        }

        return price - (discount * 100 / price);
    }

    private static Map<String, Integer> itemsLoad() {
        Map<String, Integer> itemsMap = new HashMap<>();
        itemsMap.put("mouse", 10);
        itemsMap.put("keyboard", 20);
        itemsMap.put("monitor", 100);
        itemsMap.put("tablet", 200);
        itemsMap.put("laptop", 1000);
        return itemsMap;
    }
}
