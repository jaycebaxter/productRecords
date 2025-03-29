import java.time.LocalDate;

/**
 * Perishable Product Class
 */

public class Perishable extends Product{

    // Expiry date
    private LocalDate expiryDate;

    // Getter & setter for expiryDate
    /**
     *
     * @return expiry date
     */

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     *
     * @param expiryDate
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
     * @param skuNum
     * @param productName
     * @param productCost
     * @param inStock
     * @param toOrder
     * @param specialInstructions
     * @param expiryDate
     */
    public Perishable(int skuNum, String productName, double productCost, int inStock, int toOrder, String specialInstructions, LocalDate expiryDate) {
        super(skuNum, productName, productCost, inStock, toOrder, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Overrides display function adding expiry date to it
    @Override
        public void display() {
            super.display();
            System.out.println("Expiry Date: " + expiryDate);
    }
}
