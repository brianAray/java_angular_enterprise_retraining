package com.revature.monday.mapexample;

public abstract class Entity {
    private String name;
    private Integer age;

    public Entity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
