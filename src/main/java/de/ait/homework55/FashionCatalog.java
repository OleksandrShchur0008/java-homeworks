package de.ait.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionCatalog {

    private EnumMap<FashionCategory, Set<FashionItem>> catalog;

    public FashionCatalog() {
        catalog = new EnumMap<>(FashionCategory.class);
        for (FashionCategory category : FashionCategory.values()) {
            catalog.put(category, new HashSet<>());
        }
    }

    public void addFashionItem (FashionItem fashionItem) {
        catalog.get(fashionItem.getFashionCategory()).add(fashionItem);
    }

    public void showInfoAboutSeason(Season season) {
        for (FashionCategory fashionCategory : FashionCategory.values()) {
            System.out.println("Category --> " + fashionCategory.name());
            for(FashionItem fashionItem : catalog.get(fashionCategory)) {
                if(fashionItem.getSeason().equals(season)) {
                    System.out.println(fashionItem);
                }
            }
        }
    }
}
