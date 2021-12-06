package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.DiscountFinder;
import edu.westga.cs3211.discountFinder.model.DistanceEnum;
import edu.westga.cs3211.discountFinder.model.Filter;
import edu.westga.cs3211.discountFinder.model.Item;

public class TestFilterByItemName {
    
    @Test
    void TestNoItemMatches() {
        DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());
        
        ArrayList<Item> filtered = temp.filterByName("Shoes");

        assertEquals(filtered.size(), 0);
    }

    @Test
    void TestOneItemMatches() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());
        
        ArrayList<Item> filtered = temp.filterByName("Dell");

        assertEquals(filtered.size(), 1);
        assertEquals(filtered.get(0), finder.getItem(0));
    }

    @Test
    void TestTwoItemMatches() {
    	DiscountFinder finder = new DiscountFinder();
        Filter temp = new Filter(finder.getItems());
        
        ArrayList<Item> filtered = temp.filterByName("Del");

        assertEquals(filtered.size(), 2);
        assertEquals(filtered.get(0), finder.getItem(0));
        assertEquals(filtered.get(1), finder.getItem(6));
    }


}
