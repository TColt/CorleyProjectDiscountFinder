package edu.westga.cs3211.discountFinder.model;

public class Item {

    private String favorite;
    private Seller seller;
    private String itemName;
    private Category category;

    /**
     * Item constructor
     * 
     * @param name     name of the item
     * @param seller   seller of the item
     * @param category
     */

    public Item(String name, Seller seller, Category category) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }

        if (this.favorite == null) {
            throw new IllegalArgumentException("favorite cannot be null.");
        }

        this.seller = seller;
        this.favorite = "";
        this.itemName = name;
        this.category = category;

    }

    public String getName() {
        return this.itemName;
    }

    public String getFavorite() {
        return this.favorite;
    }

    public void setFavorite() {
        this.favorite = "*";
    }

    public String toString() {
        return this.itemName + " at " + this.seller.getSellerName() + " in " + this.category.name() + " "
                + this.favorite;
    }
}
