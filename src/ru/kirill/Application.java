package ru.kirill;

import ru.kirill.models.Person;
import ru.kirill.models.Soldier;

public class Application {

    public static void main(String[] args) {

        System.out.println(Person.SPECIES);

        Soldier soldier = new Soldier("Bruce", "Petrovich", "Williams", "sergiant");
        Person person = new Person("Kolosov", "Dmitrievich", "Kirill");

        Person.printPerson(soldier);
        Person.printPerson(person);

    }

}
