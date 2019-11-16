package ru.kirill.models;

public class Person {

    public static String SPECIES = "Mummle";

    public static void printPerson(Person person) {
        System.out.println(person.toString());
    }

    private String name;
    private String surname;
    private String secondName;
    private int age;

    public Person() {}

    public Person(String name, String secondName, String surname){
        this.name = name;
        this.surname = surname + "chkas";
        this.secondName = secondName;
    }

    public Person(String name, String secondName, String surname, int age) {
        this(name, secondName, surname);
        this.age = age;

    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname + "chkas";
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String fullName = name + " " + secondName + " " + surname + " " + age;
        return fullName;
    }

}
