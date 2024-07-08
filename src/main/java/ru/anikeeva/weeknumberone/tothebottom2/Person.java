package ru.anikeeva.weeknumberone.tothebottom2;

public class Person {
    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + ", Возраст: " + this.age;
    }
}
