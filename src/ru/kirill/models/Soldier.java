package ru.kirill.models;

public class Soldier extends Person {

    String rank;

    public Soldier(String name, String secondName, String surname, String rank) {
        super(name, secondName, surname);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " " + super.toString();
    }
}
