// package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestDiscountFinder;

// import static org.junit.jupiter.api.Assertions.*;

// import java.util.ArrayList;

// import org.junit.jupiter.api.Test;

// import edu.westga.cs3211.discountFinder.model.DiscountFinder;
// import edu.westga.cs3211.discountFinder.model.Item;

// class TestfindDiscounts {
    
//     @Test
//     void TestEveryItemDiscounted() {
//         DiscountFinder finder = new DiscountFinder();

//         Item item1 = new Item("Fruit", "Publix", "Generic", 5, true);
//         Item item2 = new Item("Cereal", "Publix", "Generic", 25, true);
//         Item item3 = new Item("Beans", "Publix", "Generic", 6, true);
//         finder.addItem(item1);
//         finder.addItem(item2);
//         finder.addItem(item3);

//         ArrayList<Item> discounted = finder.findDiscounts();

//         assertEquals(discounted.get(0),finder.getItem(0));
//         assertEquals(discounted.get(1),finder.getItem(1));
//         assertEquals(discounted.get(2),finder.getItem(2));

//     }

//     @Test
//     void TestNoItemDiscounted() {
//         DiscountFinder finder = new DiscountFinder();

//         Item item1 = new Item("Fruit", "Publix", "Generic", 5, false);
//         Item item2 = new Item("Cereal", "Publix", "Generic", 25, false);
//         Item item3 = new Item("Beans", "Publix", "Generic", 6, false);
//         finder.addItem(item1);
//         finder.addItem(item2);
//         finder.addItem(item3);

//         ArrayList<Item> discounted = finder.findDiscounts();

//         assertEquals(0,discounted.size());

//     }

//     @Test
//     void TestOneItemDiscounted() {
//         DiscountFinder finder = new DiscountFinder();

//         Item item1 = new Item("Fruit", "Publix", "Generic", 5, false);
//         Item item2 = new Item("Cereal", "Publix", "Generic", 25, true);
//         Item item3 = new Item("Beans", "Publix", "Generic", 6, true);
//         finder.addItem(item1);
//         finder.addItem(item2);
//         finder.addItem(item3);

//         ArrayList<Item> discounted = finder.findDiscounts();

//         assertEquals(discounted.get(0),finder.getItem(1));
//         assertEquals(discounted.get(1),finder.getItem(2));

//     }
// }
