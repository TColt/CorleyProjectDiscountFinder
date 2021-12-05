package edu.westga.cs3211.discountFinder.test.model.discountFinder.TestCreateDiscountList;

import org.junit.jupiter.api.Test;


import edu.westga.cs3211.discountFinder.model.CreateDiscountList;
import edu.westga.cs3211.discountFinder.model.Item;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;



class TestConstructor{
    @Test
    void testValidConstruction() {
        CreateDiscountList tempList = new CreateDiscountList();
        ArrayList<Item> testArray = tempList.returnItemList();

        assertEquals(8, testArray.size());
      
    }
}
