package com.revature.thursday.demo;

import com.revature.thursday.model.Adult;

public class DynamicProxyDriver {
    public static void main(String[] args) {
        Adult a1 = new Adult("Mike", 30, "London", "England");

        // I want to modify the method at runtime but I can't as it's not my code
        // It is from an external framework

        a1.introduce();

        /*
        Reflection API is used to examine or modify the behavior of the classes/methods/interfaces
        at runtime

        This allows you to change the runtime behavior of the interfaces and their class implementations
         */

        // First get the ClassLoader from the original object that we want to create a proxy for
        ClassLoader a1ClassLoader = a1.getClass().getClassLoader();

        // Capture all the interfaces that the original object implements

        Class[] interfaces = a1.getClass().getInterfaces();

        // Create a proxy for our Adult obj
        // Person proxyA1 = (Person) Proxy.newProxyInstance(a1ClassLoader, interfaces, new Person)
    }
}
