package com.revature.thursday.model;

import java.util.Objects;

public class Bird extends Animal{
    private boolean walks;

    public Bird(){
        super("Bird");
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, boolean walks) {
        super(name);
        this.walks = walks;
    }

    public boolean isWalks() {
        return walks;
    }

    public void setWalks(boolean walks) {
        this.walks = walks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return walks == bird.walks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), walks);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "walks=" + walks +
                '}';
    }
}
