package de.ait.homework27;

import java.util.ArrayList;
import java.util.List;

public class TestShop {
    public static void main(String[] args) {
        List<Product> products = createProducts();

        Inventory inventory = new Inventory(products);

        inventory.showAllProducts();
        inventory.sell(products.get(0), 910);

        inventory.sell("Fujitsu");
        inventory.showAllProducts();

        SortUtil sortUtil = new SortUtil();
        products = sortUtil.sortByName(products, true);
        inventory.showAllProducts();
    }
        private static List<Product> createProducts(){
            List<Product> productList = new ArrayList<>();
            Electronics TV = new Electronics("Sony", 459.99, 120, 5);
            Electronics Notebook = new Electronics("Fujitsu", 309.99, 74, 2);
            Electronics Watch = new Electronics("Apple Watch Series 9", 600, 150, 1);
            Groceries fruit = new Groceries("Banana", 1.99, 1024, "25.09.2023" );
            Groceries vegetable = new Groceries("Potato", 3.99, 401, "03.11.2023");
            Groceries cola = new Groceries("Coca-Cola", 1.98, 562, "01.09.2024");
            productList.add(TV);
            productList.add(Notebook);
            productList.add(Watch);
            productList.add(fruit);
            productList.add(vegetable);
            productList.add(cola);
            return productList;
    }
}
