package models;

import java.util.Objects;

public class Animal {
    /*
    This is the member visibility scope
        public		Class	Package	SubClass World
        protected	Class	Package	Subclass
        default		Class	Package
        private		Class
    */

    private String name;
    public int age;
    protected String colour;
    int legs;

    static public String keyword = "Hello";

    public static String speak(){
        return "Hello There";
    }

    public Animal(String name, int age, String colour, int legs){
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.legs = legs;
    }

    /*
    Non-Access modifiers
    Keywords that you can add that don't modify access
    - Static
        A field or method with this means that it is connected to the Class not the object
    - Final
        Variables that are final cannot be changed once assigned
        Methods cannot be overriden
        Classes cannot be inherited
    - Abstract
        An abstract method does not need an implementation unless it is extended and used in a sub class
        An abstract class contains abstract methods and cannot be instantiated by itself
     */

    protected final void jump(){
        String randomWord = "Hello";
        System.out.println(this.name + " has jumped");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public static String getKeyword() {
        return keyword;
    }

    public static void setKeyword(String keyword) {
        Animal.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && legs == animal.legs && Objects.equals(name, animal.name) && Objects.equals(colour, animal.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour, legs);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", legs=" + legs +
                '}';
    }
}
