package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestItem;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.Item;

import static org.junit.jupiter.api.Assertions.*;



class TestConstructor{
    @Test
    void testValidConstruction() {
        Item item = new Item("name", "store", "brand", 60, true);

        assertAll(
            () -> assertEquals("name", item.getName()),
            () -> assertEquals("store", item.getStore()),
            () -> assertEquals("brand", item.getBrand()),
            () -> assertEquals(60, item.getPrice()),
            () -> assertEquals(true, item.isDiscounted())
        );
    }

    @Test
    void testNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Item(null, "store", "brand", 60, true));
    }

    @Test
    void testNullStore() {
        assertThrows(IllegalArgumentException.class, () -> new Item("name", null, "brand", 60, true));
    }

    @Test
    void testNullBrand() {
        assertThrows(IllegalArgumentException.class, () -> new Item("name", "store", null, 60, true));
    }

    @Test
    void testPastZeroPrice() {
        assertThrows(IllegalArgumentException.class, () -> new Item("name", "store", "brand", -2, true));
    }
    
}