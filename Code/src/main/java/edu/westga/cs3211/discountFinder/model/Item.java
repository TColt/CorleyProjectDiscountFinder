package edu.westga.cs3211.discountFinder.model;

public class Item {

    private double price;
    private boolean discounted;
    private String name;
    private String store;
    private String brand;

    public Item(String name, String store, String brand, double price, boolean discounted) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }

        if (store == null) {
            throw new IllegalArgumentException("store cannot be null.");
        }

        if (brand == null) {
            throw new IllegalArgumentException("brand cannot be null.");
        }

        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than 0");
        }

        this.brand = brand;
        this.name = name;
        this.store = store;
        this.price = price;
        this.discounted = discounted;
    }

    public String getName() {
        return this.name;
    }

    public String getStore() {
        return this.store;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isDiscounted() {
        return this.discounted;
    }

    public String toString() {
        return this.name + " " + this.brand + " " + this.store + " " + this.price + " " + this.discounted;
        
    }
}
