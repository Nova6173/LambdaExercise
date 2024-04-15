package se.Lexicon.Lambda;

import java.util.ArrayList;
import java.util.List;



public class ProductApp {
    public static void main (String[] args) {

        List<Product> products = new ArrayList<> ();

        Product product1 = (new Product ("Apple", 2.99, 10));
        products.add(product1);
        products.add (new Product ("Orange", 1.99, 0));
        products.add (new Product ("Banana", 1.70, 10));
        products.add (new Product ("Grape", 3.99, 10));
        products.add (new Product ("Pear", 1.99, 0));


        //  Print out all Products that have stock value of 0.
        Conditional conditionalForStockZero = (p) -> p.getStock () == 0;
        Action printProduct = (p) -> System.out.println (p.toString());
        process  (products, conditionalForStockZero, printProduct);



        // Print out the productName of all the Products that starts with B.

        process(products, (p) -> p.getName ().startsWith ("B"), (p) -> System.out.println (p.getName ()));


        // Print out all Products that have price above 100 AND lower than 150
        process(products, (p) -> p.getPrice() > 100 && p.getPrice() < 150, (p) -> System.out.println(p.toString()));


        // Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
        process(products, (p) -> p.getStock() > 0 && p.getStock() < 10, (p) -> p.setPrice(p.getPrice() * 1.5));

    }

    public static void process (List < Product > list, Conditional filter, Action action){
        for (Product product : list) {
            if (filter.test (product)) {
                action.execute (product);
            }
        }

    }

}

