/**
 * @Program             productRecords
 * @Author              Jayce Baxter
 * @Date                March 28th, 2025
 * @Description         Collects information about various products, both perishable and nonperishable
 */

import java.time.LocalDate;

/**
 * Perishable Product Class
 */

public class Perishable extends Product{

    // Expiry date
    private LocalDate expiryDate;


    /**
     * Gets the expiry date
     * @return expiry date
     */

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the expiry date
     * @param expiryDate expiry date of the product
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Default constructor, sets default date to Jan 1st 1970
     */
    public Perishable() {
        super();
        this.expiryDate = LocalDate.of(1970, 1, 1);
    }

    /**
     * Parameterized Constructor
     * @param skuNum SKU number of the product
     * @param productName Name of the product
     * @param productCost Cost of the product
     * @param inStock Number of the product in stock
     * @param toOrder Number of the product to order
     * @param specialInstructions Special instructions for storing the product
     * @param expiryDate Expiry date of the product
     */
    public Perishable(int skuNum, String productName, double productCost, int inStock, int toOrder, String specialInstructions, LocalDate expiryDate) {
        super(skuNum, productName, productCost, inStock, toOrder, specialInstructions);
        this.expiryDate = expiryDate;
    }

    /**
     * Overrides display function adding expiry date to it
     */
    @Override
        public void display() {
            super.display();
            System.out.println("Expiry Date: " + expiryDate);
    }
}
