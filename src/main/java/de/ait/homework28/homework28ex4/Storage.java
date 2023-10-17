package de.ait.homework28.homework28ex4;

public interface Storage {

    void store(String element);

    String retrieve(int index);
    int count();

}
