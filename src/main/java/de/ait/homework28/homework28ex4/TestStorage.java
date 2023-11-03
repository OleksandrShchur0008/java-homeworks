package de.ait.homework28.homework28ex4;

public class TestStorage {
    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage(5);
        fileStorage.store("Item 1");
        fileStorage.store("Item 2");
        fileStorage.store("Item 3");
        fileStorage.store("Item 4");
        fileStorage.store("Item 5");

        System.out.println("count: " + fileStorage.count() +
                " capacity: " + fileStorage.getCapacity());
        fileStorage.store("Item 6");
        System.out.println(fileStorage.retrieve(2));
        System.out.println(fileStorage.getItemsStored());
        fileStorage.store("ITEM @");
        fileStorage.retrieve(21);

        System.out.println("--------------");

        MemoryStorage memoryStorage = new MemoryStorage(3);
        memoryStorage.store("ITEM 1");
        memoryStorage.store("ITEM 2");
        memoryStorage.store("ITEM 3");

        System.out.println("count: " + memoryStorage.count() +
                " capacity: " + memoryStorage.getCapacity());
        fileStorage.store("ITEM 7");
        fileStorage.retrieve(21);
        System.out.println(memoryStorage.getItemsStored());
    }
}
