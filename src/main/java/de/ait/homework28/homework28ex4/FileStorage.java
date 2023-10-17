package de.ait.homework28.homework28ex4;

import java.util.ArrayList;
import java.util.List;

public class FileStorage implements Storage {

    private int capacity;


    private List<String> itemsStored;

    public FileStorage(int capacity) {
        this.capacity = capacity;
        this.itemsStored = new ArrayList<>();
    }

    public FileStorage(int capacity, List<String> itemsStored) {
        this.capacity = capacity;
        this.itemsStored = itemsStored;
    }

    @Override
    public void store(String item) {
        if(capacity == 0){
            System.out.println("NO capacity in FileStorage");
        }
        else {
            itemsStored.add(item);
            capacity--;
            System.out.println("Item " + item + " was stored in FileStorage");
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
