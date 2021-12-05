package edu.westga.cs3211.discountFinder.model;

import java.util.ArrayList;

public class DiscountFinder {

    private ArrayList<Item> items;
    private CreateDiscountList generatedList;

    public DiscountFinder() {
        this.generatedList = new CreateDiscountList();
        this.items = this.generatedList.returnItemList();
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

}
