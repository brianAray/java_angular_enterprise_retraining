package com.revature.thursday.demo;

import com.revature.thursday.model.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
This is a Dynamic Proxy Design Patter
A proxy is an "add-on" to a class, that allows us to intercept method invocation
and modify runtime behavior

Resource
https://codegym.cc/groups/posts/208-dynamic-proxies
 */
public class PersonInvocationHandler implements InvocationHandler {

    /*
    The InvocationHandler Interface from java.lang.reflect

    InvocationHandler is a special interface that lets us intercept any
    method call to our object and add the additional behavior.

    We need to create out own interceptor (That's what PersonInvocationHandler
    is, it's a class that implements the InvocationHandler

    We will need to pass an instantiation of this class into the
    Proxy.newProxyInstance() constructor in order to make a proxy object
     */

    // Declare the INTERFACE that we're overriding
    // We can only use invocationHandlers with interfaces

    private Person person;

    // A constructor for the proxy object
    public PersonInvocationHandler(Person person){
        super();
        this.person = person;
    }

    // Using this method, we can modify the behavior of a class using reflection
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Here we're adding extra functionality (a message) and still invoking the
        // original method
        System.out.println("Hello!");

        // The invoke() method has access to the originally invoked method and all its args
        return method.invoke(person, args);
    }
}
