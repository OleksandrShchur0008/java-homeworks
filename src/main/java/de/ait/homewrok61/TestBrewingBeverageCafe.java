package de.ait.homewrok61;

public class TestBrewingBeverageCafe {

    public static void main(String[] args) {

        CoffeeMakerThread coffeeMakerThread1 = new CoffeeMakerThread();
        coffeeMakerThread1.start();

        BartenderThread bartenderThread1 = new BartenderThread("Tea");
        bartenderThread1.start();

        BartenderThread bartenderThread2 = new BartenderThread("Hot chocolate");
        bartenderThread2.start();

        SommelierThread sommelierThread1 = new SommelierThread("Lagoon");
        sommelierThread1.start();

        BartenderThread bartenderThread3 = new BartenderThread("Cocktail");
        bartenderThread3.start();

        CoffeeMakerThread coffeeMakerThread2 = new CoffeeMakerThread();
        coffeeMakerThread2.start();

        SommelierThread sommelierThread2 = new SommelierThread("Cartier");
        sommelierThread2.start();

        TeaMasterThread teaMasterThread1 = new TeaMasterThread("Green");
        teaMasterThread1.start();

        TeaMasterThread teaMasterThread2 = new TeaMasterThread("Forest berries");
        teaMasterThread2.start();

    }
}
