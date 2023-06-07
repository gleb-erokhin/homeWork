package familyTree;

import familyTree.comparators.ByDate;
import familyTree.comparators.ByName;
import human.Human;
import human.iterators.HumanIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* у него будет список людей и методы работы с этим списком
* добавить нового человека в дерево или найти в дереве
* как вендинг машин из примера семинара*/
public class FamilyTree implements Serializable, Iterator<Human> {
    private List<Human> personList;

    public FamilyTree() { this(new ArrayList<>()); }

    public FamilyTree(List<Human> humanList) {
        this.personList = humanList;
    }

    public boolean add(Human human){
        if(human == null) {
            return false;
        }
        if(!personList.contains(human)) {
            personList.add(human);
            if(human.getFather() != null) {
                human.getFather().childAdd(human);
            }
            if (human.getMother() != null) {
                human.getMother().childAdd(human);
            }
            return true;
        }
        return false;
    }

    public Human findPerson(String name) {
        for(Human human: personList) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    public String findHuman() {
        StringBuilder find = new StringBuilder(); // создаем экземпляр класса СтрингБилдер
        find.append("Find: ");
        find.append(personList.size());
        find.append(" records: \n");
        for(Human human: personList){
            find.append(human.getInfo());
            find.append("\n");
        }
        return find.toString();
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(personList);
    }

    /**
     * Сортирует древо по дате рождения
     */
    public void sortByDate() {
        personList.sort(new ByDate());
    }

    /**
     * Сортирует древо в алфавитном порядке
     */
    public void sortByName() {

        personList.sort(new ByName());
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Human next() {
        return null;
    }
}
