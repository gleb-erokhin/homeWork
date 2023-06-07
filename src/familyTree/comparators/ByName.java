package familyTree.comparators;

import human.Human;

import java.util.Comparator;

public class ByName implements Comparator<Human> {
    public int compare(Human human1, Human human2) {
        return human1.getName().compareTo(human2.getName());
    }
}
