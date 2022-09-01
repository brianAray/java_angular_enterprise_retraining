package com.revature.thursday.demo;

import com.revature.thursday.model.Adult;
import com.revature.thursday.model.Person;

import java.lang.reflect.Proxy;

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
        Person proxyA1 = (Person) Proxy.newProxyInstance(a1ClassLoader, interfaces, new PersonInvocationHandler(a1));

        /*
        What is a proxy?

        A Proxy is a design pattern. We create and use proxy objects when we want to
        add or modify some functionality of an already existing class. The proxy object
        is used instead of the original one.

        Usually, the proxy objects have the same methods as the original one and in
        Java, proxy classes usually extend the original class. The proxy has a handle
        to the original object and can call the method on that. (InvocationHandler)
         */

        // Call method we have modified in Person Invocation Handler
        proxyA1.introduce();


        /*
        We can use INSPECTION to create a method that prints
        all the methods that belong to the Adult class
         */

        ClassInspector.listDeclaredMethods(Adult.class);
        ClassInspector.listPublicMethods(Adult.class);
    }
}
