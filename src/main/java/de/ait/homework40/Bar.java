package de.ait.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {

    private Map<String, Drink> barCollection;

    public boolean addDrink(String id, Drink drink) {
        if(id == null || drink == null) {
            System.out.println("Incorrect parameters.");
            return false;
        } else {
            barCollection.put(id, drink);
            System.out.println(drink.getName() + " has successfully added.");
            return true;
        }
    }

    public Drink getDrink(String id) {
        return barCollection.get(id);
    }

    public Map<String, Drink> getBarCollection() {
        Map<String, Drink> barCollectionCopy = new HashMap<>(barCollection);
        return barCollectionCopy;
    }
}
