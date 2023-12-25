package de.ait.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroManagerTest {

    private SuperheroManager superheroManager;

    @BeforeEach
    void setUp() {
        superheroManager = new SuperheroManager();
    }

    @Test
    void addSuperheroHappyPath() {
        assertEquals(0,superheroManager.getAllSuperheroes().size());
        Superhero superheroThor = new Superhero("Thor", 10, 1021);
        superheroManager.addSuperhero(superheroThor);
        assertEquals(superheroThor, superheroManager.getSuperhero(superheroThor.getName()));
        assertEquals(1,superheroManager.getAllSuperheroes().size());
    }

    @Test
    void addSuperheroExistHeroError() {
        Superhero superheroThor = new Superhero("Thor", 10, 1021);
        superheroManager.addSuperhero(superheroThor);
        assertEquals(superheroThor, superheroManager.getSuperhero(superheroThor.getName()));
        assertEquals(1,superheroManager.getAllSuperheroes().size());
        assertThrows(IllegalArgumentException.class, () -> {superheroManager.addSuperhero(superheroThor);});
        assertEquals(1,superheroManager.getAllSuperheroes().size());
    }

    @Test
    void addSuperheroWrongPowerError() {
        Superhero superheroThor = new Superhero("Thor", 100, 1021);
        assertThrows(IllegalArgumentException.class, () -> {superheroManager.addSuperhero(superheroThor);});
        assertEquals(0,superheroManager.getAllSuperheroes().size());
    }


    @Test
    void removeSuperheroHappyPath() {
        Superhero superheroBlackPanther = new Superhero("Black Panther", 8, 43);
        Superhero superheroGoldPanther = new Superhero("Gold Panther", 7, 35);
        superheroManager.addSuperhero(superheroBlackPanther);
        superheroManager.addSuperhero(superheroGoldPanther);
        assertEquals(superheroBlackPanther, superheroManager.getSuperhero(superheroBlackPanther.getName()));
        assertEquals(2,superheroManager.getAllSuperheroes().size());

        superheroManager.removeSuperhero(superheroBlackPanther.getName());


        assertEquals(1,superheroManager.getAllSuperheroes().size());
    }

    @Test
    void removeSuperheroError() {
        Superhero superheroBlackPanther = new Superhero("Black Panther", 8, 43);
        superheroManager.addSuperhero(superheroBlackPanther);
        assertEquals(superheroBlackPanther, superheroManager.getSuperhero(superheroBlackPanther.getName()));
        assertEquals(1,superheroManager.getAllSuperheroes().size());
        assertThrows(IllegalArgumentException.class, () -> {superheroManager.removeSuperhero("Gold Panther");});
        assertEquals(1,superheroManager.getAllSuperheroes().size());
    }

    @Test
    void getSuperheroHappyPath() {
        Superhero superheroBatman = new Superhero("Batman", 6, 41);
        superheroManager.addSuperhero(superheroBatman);
        assertNotNull(superheroManager.getSuperhero(superheroBatman.getName()));
        assertEquals(superheroBatman, superheroManager.getSuperhero(superheroBatman.getName()));
    }

    @Test
    void getSuperheroError() {
        Superhero superheroBatman = new Superhero("Batman", 6, 41);
        superheroManager.addSuperhero(superheroBatman);
        assertNull(superheroManager.getSuperhero("Joker"));
    }

    @Test
    void getAllSuperheroes() {
        Superhero superheroThor = new Superhero("Thor", 10, 1021);
        Superhero superheroBlackPanther = new Superhero("Black Panther", 8, 43);
        Superhero superheroBatman = new Superhero("Batman", 6, 41);
        superheroManager.addSuperhero(superheroThor);
        superheroManager.addSuperhero(superheroBlackPanther);
        superheroManager.addSuperhero(superheroBatman);
        assertEquals(3,superheroManager.getAllSuperheroes().size());
        assertEquals(superheroBlackPanther, superheroManager.getAllSuperheroes().get(1));
        assertEquals(superheroThor, superheroManager.getAllSuperheroes().get(0));
        assertEquals(superheroBatman, superheroManager.getAllSuperheroes().get(2));
    }

    @Test
    void testUpdateSuperheroHappyPath() {
        Superhero superheroBlackPanther = new Superhero("Black Panther", 8, 43);
        superheroManager.addSuperhero(superheroBlackPanther);
        Superhero superheroBlackPantherUpdated = new Superhero("Black Panther", 9, 45);
        superheroManager.updateSuperhero("Black Panther", superheroBlackPantherUpdated);
        Superhero superheroResult = superheroManager.getSuperhero("Black Panther");
        assertEquals(9, superheroResult.getPower());
        assertEquals(45, superheroResult.getAge());
    }
}