package io.augusto.estreams;

public enum Loyalty {

    PLATINUM(40),
    GOLD(30),
    PRIME(20),
    SILVER(15),
    BASIC(0);

    private int discount;

    Loyalty(int discount){
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
