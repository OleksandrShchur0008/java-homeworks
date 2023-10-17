package de.ait.homework36;

import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {

    private List<Superhero> superheroes = new ArrayList<>();

    public void addSuperhero(Superhero superhero) {
        if (!checkSuperhero(superhero.getName()) && checkPower(superhero)) {
            superheroes.add(superhero);
        } else {
            throw new IllegalArgumentException("Hero " + superhero + " already exists. Or incorrect power.");
        }
    }

    public void removeSuperhero(String name) {
        if (checkSuperhero(name)) {
            for (Superhero superhero : superheroes) {
                if (superhero.getName().equalsIgnoreCase(name)) {
                    superheroes.remove(superhero);
                }
            }
        } else {
            throw new IllegalArgumentException("This Superhero cannot be removed, was not found");
        }
    }

    public Superhero getSuperhero(String name) {
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equalsIgnoreCase(name)) {
                return superhero;
            }
        }
        return null;
    }

    public List<Superhero> getAllSuperheroes() {
        return new ArrayList<>(superheroes);

    }

    public boolean updateSuperhero(String name, Superhero newSuperheroParameters) {
        Superhero superhero = getSuperhero(name);
        if (superhero != null) {
            superhero.setName(newSuperheroParameters.getName());
            superhero.setAge(newSuperheroParameters.getAge());
            superhero.setPower(newSuperheroParameters.getPower());
            return true;
        }
        return false;
    }

    private boolean checkSuperhero(String name) {
        for (Superhero superhero : superheroes) {
            if (name.equalsIgnoreCase((superhero.getName()))) {
                return true;
            }
        }
        return false;
    }

    private boolean checkPower(Superhero superhero) {
        if (superhero.getPower() >= 1 && superhero.getPower() <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
