package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestFilter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.Category;
import edu.westga.cs3211.discountFinder.model.DiscountFinder;
import edu.westga.cs3211.discountFinder.model.Filter;
import edu.westga.cs3211.discountFinder.model.Item;
import edu.westga.cs3211.discountFinder.model.Seller;

class TestGetItems {

	@Test
    void TestFilterForClothing() {
		ArrayList<Item> items = new ArrayList<Item>();
        
        Seller seller = new Seller(20, "store");
        
        Item item1 = new Item("electro", seller, Category.ELECTRONICS);
        
        items.add(item1);

        Filter temp = new Filter(items);

        assertEquals(1, temp.getItems().size());
    }

}
