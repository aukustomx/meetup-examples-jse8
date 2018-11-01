package io.augusto.cmethodreference;

import java.util.Map;

public class Item {

    private String name;
    private Integer price;

    public Item(Map.Entry<String, Integer> entry) {
        this.name = entry.getKey();
        this.price = entry.getValue();
    }

    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
