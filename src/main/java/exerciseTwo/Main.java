package exerciseTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculation sumObj = new Calculation();

        List<Product> productsList = new ArrayList<Product>();

        Product dress = new Product();
        dress.setProductName("dress");
        dress.setProductCost(500);
        dress.setQuantityOfproduct(1);
        productsList.add(dress);

        Product chair = new Product();
        chair.setProductName("chair");
        chair.setProductCost(1000);
        chair.setQuantityOfproduct(2);
        productsList.add(chair);

        Product table = new Product();
        table.setProductName("table");
        table.setProductCost(2000);
        table.setQuantityOfproduct(3);
        productsList.add(table);

		/*
		 * Product chairWithBench = new Product();
		 * chairWithBench.setProductName("chair"); chairWithBench.setProductCost(1000);
		 * productsList.add(chairWithBench);
		 */
         System.out.println("Total Cost of All Produts-->" + sumObj.sumofAllProdutCost(productsList));




        for (Product product : productsList) {

            System.out.println(product.getProductName() + " ---->" + product.getTotalCostOfProduct()+ " ---->" + product.getQuantityOfproduct());

        }


    }


}
