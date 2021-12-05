package edu.westga.cs3211.discountFinder.model;

import java.util.ArrayList;

public  class CreateDiscountList {
    ArrayList<Item> itemList = new ArrayList<Item>();
    

    public CreateDiscountList(){
        

        Seller dell = new Seller(25, "Dell");
        Seller nike = new Seller(50, "Nike");
        Seller amazon = new Seller(100, "Amazon");
        Seller walmart = new Seller(10, "Walmart");
        Seller adamandeve = new Seller(42069, "Adam and Eve");

        Item item1 = new Item("Dell Laptop", dell, Category.ELECTRONICS);
        Item item2 = new Item("Socks", dell, Category.CLOTHING);
        Item item3 = new Item("Huraches", nike, Category.CLOTHING);
        Item item4 = new Item("Dice Box", amazon, Category.OTHER);
        Item item5 = new Item("Pokemon Cards", walmart, Category.OTHER);
        Item item6 = new Item("Cheezits", walmart, Category.FOOD);
        Item item7 = new Item("Delta 8 Pen", amazon, Category.ELECTRONICS);
        Item item8 = new Item("Bleep Bleep Bleep", adamandeve, Category.APPLIANCES);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
    }

    public ArrayList<Item> returnItemList(){
        return this.itemList;
    }
}
