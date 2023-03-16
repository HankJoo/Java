package com.hankgroup.yourorder.item;

public class Item {
    private long id;
    private String name;
    private int price;
    private int stockQuantity;

    protected Item() {}

    public Item(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}