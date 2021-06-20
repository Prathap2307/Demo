package exerciseTwoOld;

import java.util.List;

public class Calculation implements exerciseService {

    public int sumofAllProdutCost(List<Product> productsList){
       int sumofAllProductCost = 0;

        for (Product product : productsList) {
            sumofAllProductCost += product.getProductCost();
        }
        return sumofAllProductCost;

    }
    
    public int multipleofAllProdutCost(List<Product> productsList){
        int sumofAllProductCost = 1;

         for (Product product : productsList) {
             sumofAllProductCost = sumofAllProductCost * product.getProductCost();
         }
         return sumofAllProductCost;

     }


}
