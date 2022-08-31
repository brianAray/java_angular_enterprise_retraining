package com.revature.thursday.model;

import java.util.Objects;

public class Adult implements Person{

    private String name;
    private int age;
    private String city;
    private String country;

    public Adult(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + this.name);
    }

    @Override
    public void sayAge() {
        System.out.println("");
    }

    @Override
    public void sayWhereFrom() {
        System.out.println("I'm from " + this.city + ", " + this.country);
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adult adult = (Adult) o;
        return age == adult.age && Objects.equals(name, adult.name) && Objects.equals(city, adult.city) && Objects.equals(country, adult.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city, country);
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
