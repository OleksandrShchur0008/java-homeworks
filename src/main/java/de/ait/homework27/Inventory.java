package de.ait.homework27;

import java.util.List;

public class Inventory implements InventoryManagement {

    private List<Product> productList;

    public Inventory(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void restock(Product product, int quantity) {
        for (Product productToSell : productList) {
            if (productToSell.equals(product)) {
                productToSell.setQuantity(productToSell.getQuantity() + quantity);
                System.out.println("The product: " + productToSell.getName() + " has added. " +
                        "The new products Quantity is: " + productToSell.getQuantity());
                return;
            }
        }
    }

    @Override
    public void sell(Product product, int quantity) {
        for (Product productToSell : productList) {
            if (productToSell.equals(product) && checkQuantityOfProduct(product, quantity)) {
                productToSell.setQuantity(productToSell.getQuantity() - quantity);
                System.out.println("The product: " + productToSell.getName() + " has sold. " +
                        "The new products Quantity is: " + productToSell.getQuantity());
                return;
            }
        }
        System.err.println("Product " + product.getName() + " not found");
    }

    private boolean checkQuantityOfProduct(Product product, int quantity) {
        for (Product productToSell : productList) {
            if (productToSell.equals(product)) {
                if (productToSell.getQuantity() >= quantity)
                {
                    System.out.println("Products " + productToSell.getName() + " enough to sell");
                    return true;
                }
            }
        }
        System.out.println("Products " + product.getName() + " NOT enough to sell");
        return false;
    }

    public void sell(String name) {
        boolean found = false;
        for (Product productToSell : productList) {
            if (productToSell.getName().equals(name)) {
                sell(productToSell, 1);
                found = true;
                return;
            }
        }
        if (found == false) {
            System.err.println("Product " + name + " not found");
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void showAllProducts() {
        for (Product productToShow : productList) {
            System.out.println(productToShow.getInfo());
            System.out.println("----------------");
        }
    }
}


