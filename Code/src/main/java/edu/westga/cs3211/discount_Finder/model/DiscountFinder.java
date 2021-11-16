package edu.westga.cs3211.discount_Finder.model;

import java.util.ArrayList;

public class DiscountFinder {
   
    private ArrayList<Item> items;


    public DiscountFinder() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public int size() {
        return this.items.size();
    }

    public ArrayList<Item> findDiscounts() {
        ArrayList<Item> discountedItems = new ArrayList<Item>();

        for (Item item : this.items) {
            if (item.isDiscounted()) {
                discountedItems.add(item);
            }
        }
        return discountedItems;
    }

    public ArrayList<Item> findDiscountsForItem(String itemName) {
        ArrayList<Item> discountedItems = new ArrayList<Item>();

        for (Item item : this.items) {
            if (item.isDiscounted() && item.getName().equals(itemName)) {
                discountedItems.add(item);
            }
        }
        return discountedItems;
    }
}
