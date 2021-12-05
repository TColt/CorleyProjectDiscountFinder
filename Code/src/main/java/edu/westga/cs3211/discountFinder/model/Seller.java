package edu.westga.cs3211.discountFinder.model;
/**Seller class 
 * 
 * @author Team 1
 * @version CS 3211
 */
public class Seller {

    private int distance;
    private String sellerName;
    
    /**Initializing the constructor
     * 
     */
    public Seller(int distance, String sellerName) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance can not be negative");
        }
        if (sellerName == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        if (sellerName.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty");
        }

        this.distance = distance;
        this.sellerName = sellerName;
    }
    /**Get the distance 
     * 
     * @return the distance
     */
  
    public int getDistance() {
        return this.distance;
    }
    /**Get the seller name
     * 
     * @return the seller name
     */

    public String getSellerName() {
        return this.sellerName;
    }

}
