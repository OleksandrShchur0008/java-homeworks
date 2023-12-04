package de.ait.homework55;

public class Client {

    public static void main(String[] args) {

        FashionCatalog fashionCatalog = new FashionCatalog();
        FashionItem fashionItemWatch = new FashionItem("Watch", 1400, FashionCategory.ACCESSORIES, Season.SUMMER);
        FashionItem fashionItemCoat = new FashionItem("Coat", 120, FashionCategory.CLOTHES, Season.WINTER);
        FashionItem fashionItemBoots = new FashionItem("Boots", 210, FashionCategory.SHOES, Season.AUTUMN);

        fashionCatalog.addFashionItem(fashionItemWatch);
        fashionCatalog.addFashionItem(fashionItemCoat);
        fashionCatalog.addFashionItem(fashionItemBoots);

        fashionCatalog.showInfoAboutSeason(Season.WINTER);
    }
}
