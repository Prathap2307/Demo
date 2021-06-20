package exerciseTwo;

public class Product {
    private int productCost;
    private String productName;
    private int quantityOfproduct;

    public String getProductName() {
        return productName;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityOfproduct() {
        return quantityOfproduct;
    }

    public void setQuantityOfproduct(int quantityOfproduct) {
        this.quantityOfproduct = quantityOfproduct;
    }

    
    public int getTotalCostOfProduct() {
    	return quantityOfproduct * productCost;
    }
}
