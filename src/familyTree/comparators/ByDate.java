package familyTree.comparators;

import human.Human;

import java.util.Comparator;

public class ByDate implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
