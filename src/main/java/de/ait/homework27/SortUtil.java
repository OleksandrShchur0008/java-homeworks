package de.ait.homework27;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtil {
    public List<Product> sortByName(List<Product> products, boolean asc) {
        if(asc) {
            Collections.sort(products, Comparator.comparing(Product::getName));
        } else {
            Collections.sort(products, Comparator.comparing(Product::getName).reversed());
        }
        return products;
    }
}
