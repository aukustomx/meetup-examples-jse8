package io.augusto.cmethodreference;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items = new ArrayList<>();

    public Item addItem(Item item) {
        this.items.add(item);
        return item;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
