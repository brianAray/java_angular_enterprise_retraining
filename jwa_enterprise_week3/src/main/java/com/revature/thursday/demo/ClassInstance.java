package com.revature.thursday.demo;

import com.revature.thursday.model.Bird;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
There are two reflective methods to creating instances of classes

This is desirable when you want to retrieve the internal state of an object
which is only set after construction

We can use reflection to inspect the constructors and create them at runtime

 */
public class ClassInstance {

    /*
    First lets use the Bird class and confirm that it has three constructors
     */

    public void getAllConstructors() {
        Class<?> birdClass = null;
        try {
            birdClass = Class.forName("com.revature.thursday.model.Bird");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Constructor<?>[] constructors = birdClass.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }

    /*
    We can get a specific constructor based on the parameter type
     */

    public void getSpecificConstructor() {
        Class<?> birdClass = null;
        try {
            birdClass = Class.forName("com.revature.thursday.model.Bird");

            Constructor<?> cons1 = birdClass.getConstructor();
            Constructor<?> cons2 = birdClass.getConstructor(String.class);

            // Don't use the wrapper object unless you specifically use it
            // You can use the primitives like a class

            Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);

            System.out.println(cons1);
            System.out.println(cons2);
            System.out.println(cons3);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }

    /*
    Instantiating an object at runtime while supplying parameters
     */

    public void givenClassInstantiateObjectRuntime() {

        try {
            /*
            We instantiate an object by calling the newInstance method of Constructor class and passing
            the required parameters in declared order.
            WE then cast the result to the required type.

            We can call the default constructor, this is deprecated in java 9
             */
            Class<?> birdClass = Class.forName("com.revature.thursday.model.Bird");

            Constructor<?> cons1 = birdClass.getConstructor();
            Constructor<?> cons2 = birdClass.getConstructor(String.class);
            Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);

            Bird bird1 = (Bird) cons1.newInstance();
            Bird bird2 = (Bird) cons2.newInstance("Pigeon");
            Bird bird3 = (Bird) cons3.newInstance("Seagull", true);

            System.out.println(bird1);
            System.out.println(bird2);
            System.out.println(bird3);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ClassInstance ci = new ClassInstance();
        ci.getAllConstructors();
        ci.getSpecificConstructor();
        ci.givenClassInstantiateObjectRuntime();
    }

}
