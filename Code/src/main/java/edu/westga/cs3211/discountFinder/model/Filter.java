package edu.westga.cs3211.discountFinder.model;

import java.util.ArrayList;

/**
 * filer class
 * @author Team 1
 */
public class Filter {
    
	private ArrayList<Item> itemList;
	
	public Filter(ArrayList<Item> list) {
		this.itemList = new ArrayList<Item>();
		for (Item item: list) {
			this.itemList.add(item);
		}
	}
	
	public ArrayList<Item> getItems() {
		return this.itemList;
	}
	
    public ArrayList<Item> filterByCategory(Category category) {
    	ArrayList<Item> tempList = new ArrayList<Item>();
        for (Item item : this.itemList) {
            if (item.getCategory() == category) {
                tempList.add(item);
            }
        }
        return tempList;
    }

    public ArrayList<Item> filterBySeller(String seller) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getSeller().getSellerName().toLowerCase().contains(seller.toLowerCase())) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> filterByName(String name) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getName().toLowerCase().startsWith(name.toLowerCase())) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public ArrayList<Item> filterByDistance(DistanceEnum distanceto) {
        ArrayList<Item> filteredList = new ArrayList<>();
        for (Item item : this.itemList) {

            switch (distanceto) {
                case Ten:
                    if (item.getSeller().getDistance() <= 10) {
                        filteredList.add(item);
                    }
                    break;
                
                case Twenty:
                    if (item.getSeller().getDistance() <= 20) {
                        filteredList.add(item);
                    }
                    break;
                
                case Thirty:
                    if (item.getSeller().getDistance() <= 30) {
                        filteredList.add(item);
                    }
                    break;
            
                default:
                    if (item.getSeller().getDistance() > 30) {
                        filteredList.add(item);
                    }
                    break;
            }
        }
        return filteredList;
    }

}
