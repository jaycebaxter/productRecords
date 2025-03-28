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
     *
     * @return SKU Number
     */
    public int getSkuNum() {
        return skuNum;
    }

    /**
     *
     * @param skuNum
     */
    public void setSkuNum(int skuNum) {
        this.skuNum = skuNum;
    }

    /**
     *
     * @return product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     *
     * @return product cost
     */
    public double getProductCost() {
        return productCost;
    }

    /**
     *
     * @param productCost
     */
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    /**
     *
     * @return num in stock
     */
    public int getInStock() {
        return inStock;
    }

    /**
     *
     * @param inStock
     */
    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    /**
     *
     * @return num to order
     */
    public int getToOrder() {
        return toOrder;
    }

    /**
     *
     * @param toOrder
     */
    public void setToOrder(int toOrder) {
        this.toOrder = toOrder;
    }

    /**
     *
     * @return special instructions
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     *
     * @param specialInstructions
     */
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    /**
     * Default Constructor
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
     * @param skuNum
     * @param productName
     * @param productCost
     * @param inStock
     * @param toOrder
     * @param specialInstructions
     */
    public Product(int skuNum, String productName, double productCost, int inStock, int toOrder, String specialInstructions) {
        this.skuNum = skuNum;
        this.productName = productName;
        this.productCost = productCost;
        this.inStock = inStock;
        this.toOrder = toOrder;
        this.specialInstructions = specialInstructions;
    }

    // Display function
    public void display() {
        System.out.println("SKU Number: " + skuNum);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Number in Stock: " + inStock);
        System.out.println("Need to Order: " + toOrder);
        System.out.println("Special Instructions: " + specialInstructions);
    }

}
