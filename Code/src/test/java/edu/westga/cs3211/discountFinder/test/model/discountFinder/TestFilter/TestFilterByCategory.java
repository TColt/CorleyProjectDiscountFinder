package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.Category;
import edu.westga.cs3211.discountFinder.model.DiscountFinder;
import edu.westga.cs3211.discountFinder.model.Filter;
import edu.westga.cs3211.discountFinder.model.Item;
import edu.westga.cs3211.discountFinder.model.Seller;

class TestFilterByCategory {
    @Test
    void TestFilterForElectronics(){
        ArrayList<Item> items = new ArrayList<Item>();
        
        Seller seller = new Seller(20, "store");
        
        Item item1 = new Item("electro", seller, Category.ELECTRONICS);
        
        items.add(item1);

        Filter temp = new Filter(items);
        

        
        assertEquals(temp.filterByCategory(Category.ELECTRONICS).get(0).getName(), "electro");

    }

    @Test
    void TestFilterForClothing() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());
        ArrayList<Item> filtered = temp.filterByCategory(Category.CLOTHING);

        assertEquals(filtered.get(0), finder.getItem(1));
        assertEquals(filtered.get(1), finder.getItem(2));
    }

    @Test
    void TestFilterForAppliances() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());

        ArrayList<Item> filtered = temp.filterByCategory(Category.APPLIANCES);

        assertEquals(filtered.get(0), finder.getItem(7));
    }

    @Test
    void TestFilterForFood() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());

        ArrayList<Item> filtered = temp.filterByCategory(Category.FOOD);

        assertEquals(filtered.get(0), finder.getItem(5));
    }

    @Test
    void TestFilterForOther() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());

        ArrayList<Item> filtered = temp.filterByCategory(Category.OTHER);

        assertEquals(filtered.get(0), finder.getItem(3));
        assertEquals(filtered.get(1), finder.getItem(4));  
    }
}
