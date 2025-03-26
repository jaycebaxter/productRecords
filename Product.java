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
    public int getSkuNum() {
        return skuNum;
    }
    public void setSkuNum(int skuNum) {
        this.skuNum = skuNum;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public int getInStock() {
        return inStock;
    }
    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public int getToOrder() {
        return toOrder;
    }
    public void setToOrder(int toOrder) {
        this.toOrder = toOrder;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

}
