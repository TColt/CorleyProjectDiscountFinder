package edu.westga.cs3211.discount_Finder.test.model.discount_Finder.TestItem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discount_Finder.model.DiscountFinder;
import edu.westga.cs3211.discount_Finder.model.Item;

class TestFindDiscountsForItem {
    
    @Test
    void TestEveryItemDiscountedAndWanted(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Fruit", "Publix", "Generic", 5, true);
        Item item2 = new Item("Fruit", "Publix", "Generic", 25, true);
        Item item3 = new Item("Fruit", "Publix", "Generic", 6, true);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.get(0),finder.getItem(0));
        assertEquals(discounted.get(1),finder.getItem(1));
        assertEquals(discounted.get(2),finder.getItem(2));
        
    }

    @Test
    void TestEveryItemDiscountedAndNoWantedItem(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Pancake", "Publix", "Generic", 5, true);
        Item item2 = new Item("Waffle", "Publix", "Generic", 25, true);
        Item item3 = new Item("Flour", "Publix", "Generic", 6, true);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.size(),0);
        
    }

    @Test
    void TestNoItemDiscountedAndWantedItem(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Fruit", "Publix", "Generic", 5, false);
        Item item2 = new Item("Fruit", "Publix", "Generic", 25, false);
        Item item3 = new Item("Fruit", "Publix", "Generic", 6, false);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.size(),0);
    }

    @Test
    void TestNoItemDiscountedAndNoWantedItem(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Pancake", "Publix", "Generic", 5, false);
        Item item2 = new Item("Waffle", "Publix", "Generic", 25, false);
        Item item3 = new Item("Flour", "Publix", "Generic", 6, false);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.size(),0);
        
    }
    @Test
    void TestOneItemDiscountedAndAllWantedItem(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Fruit", "Publix", "Generic", 5, false);
        Item item2 = new Item("Fruit", "Publix", "Generic", 25, true);
        Item item3 = new Item("Fruit", "Publix", "Generic", 6, false);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.size(),1);
        assertEquals(discounted.get(0), item2); 
    }

    @Test
    void TestAllItemDiscountedAndOneWantedItem(){
        DiscountFinder finder = new DiscountFinder();

        Item item1 = new Item("Pancake", "Publix", "Generic", 5, true);
        Item item2 = new Item("Fruit", "Publix", "Generic", 25, true);
        Item item3 = new Item("Waffle", "Publix", "Generic", 6, true);
        finder.addItem(item1);
        finder.addItem(item2);
        finder.addItem(item3);

        ArrayList<Item> discounted = finder.findDiscountsForItem("Fruit");
        
        assertEquals(discounted.size(),1);
        assertEquals(discounted.get(0), item2); 
    }


}
