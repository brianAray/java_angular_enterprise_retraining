package Recipes;

import java.util.Objects;

public class Person {
    private String name;
    private String hairColour;
    private int age;
    private int height;

    public Person(String name, String hairColour, int age, int height) {
        this.name = name;
        this.hairColour = hairColour;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hairColour='" + hairColour + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name) && Objects.equals(hairColour, person.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hairColour, age, height);
    }
}
