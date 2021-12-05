package edu.westga.cs3211.discountFinder.model;

public class Seller {

    private int distance;
    private String sellerName;

    public Seller(int distance, String sellerName) {
        this.distance = distance;
        this.sellerName = sellerName;
    }

    public int getDistance() {
        return this.distance;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public int calculateDistance(int distance) {
        int result = 0;
        result = this.getDistance() - distance;
        return Math.abs(result);
    }
}
