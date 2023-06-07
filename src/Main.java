import familyTree.FamilyTree;
import human.Human;

import java.io.*;

/*
Реализовать, с учетом ооп подхода, приложение.
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека и дерева Под “проведением исследования”
можно понимать например получение всех детей выбранного человека.
* */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree family = new FamilyTree();

        family.add(new Human("Вова", 30));
        family.add(new Human("Алла", 30));

        family.add(new Human("Василий", 12, family.findPerson("Вова"), family.findPerson("Алла")));

        System.out.println(family.findHuman());

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("tree.out"));
//        objectOutputStream.writeObject(family);
//        objectOutputStream.close();

//        ObjectInputStream objectInputStream = new ObjectInputStream(
//                new FileInputStream("tree.out"));
//        FamilyTree treeRestored = (FamilyTree) objectInputStream.readObject();
//        objectInputStream.close();

        System.out.println(service.getInfo());

        service.sortByName();
        System.out.println(service.getInfo());

        service.sortByAge();
        System.out.println(service.getInfo());

        StudyGroup<Teacher> studyGroup = new StudyGroup<>();
    }
}
