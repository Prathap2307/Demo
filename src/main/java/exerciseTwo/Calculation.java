package exerciseTwo;

import java.util.List;

public class Calculation {

    public int sumofAllProdutCost( List<Product> productsList){
       int sumofAllProductCost = 0;

        for (Product product : productsList) {
            sumofAllProductCost += product.getProductCost();
        }
        return sumofAllProductCost;

    }


    public int getTotalPriceOfProduct( List<Product> productsList){
        int totalPrice = 0;


        return totalPrice;

    }

    public int getTotalQuantityOfProduct( List<Product> productsList){
        int quantityOfProduct = 0;




        return quantityOfProduct;

    }
}
