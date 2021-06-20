package exerciseTwoOld;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculation sumObj = new Calculation();

        List<Product> productsList = new ArrayList<Product>();

        Product dress = new Product();
        dress.setProductName("dress");
        dress.setProductCost(10);
        productsList.add(dress);

        Product chair = new Product();
        chair.setProductName("chair");
        chair.setProductCost(15);
        productsList.add(chair);

        Product table = new Product();
        table.setProductName("table");
        table.setProductCost(23);
        productsList.add(table);

       System.out.println("Total Cost of All Produts-->" + sumObj.sumofAllProdutCost(productsList));
       
       System.out.println("multiple Cost of All Produts-->" + sumObj.multipleofAllProdutCost(productsList));

    }

}
