package de.ait.homework28.homework28ex4;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage implements Storage {

    private int capacity;


    private List<String> itemsStored;

    public MemoryStorage(int capacity) {
        this.capacity = capacity;
        itemsStored = new ArrayList<>();
    }

    public MemoryStorage(int capacity, List<String> itemsStored) {
        this.capacity = capacity;
        this.itemsStored = itemsStored;
    }

    @Override
    public void store(String item) {

        if(capacity == 0){
            System.out.println("NO capacity in MemoryStorage");
            itemsStored.remove(0);
            itemsStored.add(item);
            System.out.println("Item " + item + " was stored in MemoryStorage");
        }
        else {
            itemsStored.add(item);
            capacity--;
            System.out.println("Item " + item + " was stored in MemoryStorage");
        }

    }

    @Override
    public String retrieve(int index) {
        if(index >=0 && index < itemsStored.size()) {
            return itemsStored.get(index);
        }
        else {
            System.out.println("Wrong index !!!!");
            return "";
        }
    }

    @Override
    public int count() {
        return itemsStored.size();
    }

    public int getCapacity() {
        return capacity;
    }


    public List<String> getItemsStored() {
        return itemsStored;
    }

}
