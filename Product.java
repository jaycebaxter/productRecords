/**
 * @Program             productRecords
 * @Author              Jayce Baxter
 * @Date                March 28th, 2025
 * @Description         Collects information about various products, both perishable and nonperishable
 */

/**
 * Product Class
 */

public class Product {

    // The ID / SKU of the product
    private int skuNum;

    // The name of the product
    private String productName;

    // The cost of the product
    private double productCost;

    // Number in stock
    private int inStock;

    // Amount we need to order
    private int toOrder;

    // Special instructions
    private String specialInstructions;

    // Getters and setters
    /**
     * Gets the SKU Number of the product
     * @return SKU Number
     */
    public final int getSkuNum() {
        return skuNum;
    }

    /**
     * Sets the SKU number of the product
     * @param skuNum SKU Number
     */
    public final void setSkuNum(int skuNum) {
        this.skuNum = skuNum;
    }

    /**
     * Gets the product name
     * @return product name
     */
    public final String getProductName() {
        return productName;
    }

    /**
     * Sets the product name
     * @param productName Product Name
     */
    public final void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets the product cost
     * @return product cost
     */
    public final double getProductCost() {
        return productCost;
    }

    /**
     * Sets the product cost
     * @param productCost Product cost
     */
    public final void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    /**
     * Gets the number in stock
     * @return num in stock
     */
    public final int getInStock() {
        return inStock;
    }

    /**
     * Sets the number in stock
     * @param inStock Number in stock
     */
    public final void setInStock(int inStock) {
        this.inStock = inStock;
    }

    /**
     * Gets the number to order
     * @return num to order
     */
    public final int getToOrder() {
        return toOrder;
    }

    /**
     * Sets the number to order
     * @param toOrder Number to order
     */
    public final void setToOrder(int toOrder) {
        this.toOrder = toOrder;
    }

    /**
     * Gets the special instructions
     * @return special instructions
     */
    public final String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the special instructions
     * @param specialInstructions Special instructions
     */
    public final void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    /**
     * Default Constructor
     * Sets the SKU number to 0
     * Sets the product name to N/A
     * Sets the product cost to 0.00
     * Sets the number in stock to 0
     * Sets the number to order to 0
     * Sets the special instructions to N/A
     */
    public Product() {
        this.skuNum = 0;
        this.productName = "N/A";
        this.productCost = 0.00;
        this.inStock = 0;
        this.toOrder = 0;
        this.specialInstructions = "N/A";
    }

    /**
     * Parameterized Constructor
     * @param skuNum SKU Number of the product
     * @param productName Name of the product
     * @param productCost Cost of the product
     * @param inStock Number of the product in stock
     * @param toOrder Number of the product to order
     * @param specialInstructions Special instructions for storing the product
     */
    public Product(int skuNum, String productName, double productCost, int inStock, int toOrder, String specialInstructions) {
        this.skuNum = skuNum;
        this.productName = productName;
        this.productCost = productCost;
        this.inStock = inStock;
        this.toOrder = toOrder;
        this.specialInstructions = specialInstructions;
    }

    /**
     * Display function
     */
    public void display() {
        System.out.println("SKU Number: " + skuNum);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Number in Stock: " + inStock);
        System.out.println("Need to Order: " + toOrder);
        System.out.println("Special Instructions: " + specialInstructions);
    }

}
