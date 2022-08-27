package com.revature.tuesday.optionals;

import java.util.Optional;

public class OptionalsExample {

    /*
    The optional class
    This provides a type-level solution for representing optional values instead of null references


    Creating optionals
     */

    public void createOptionalExamples(){
        // Empty optional
        Optional<String> empty = Optional.empty();

        /*
        We use the isPresent() method to check if there is a value inside the Optional Object
        A value is present only if we have created Optional with a non null value
         */

        // Optional using static method of()
        // You cannot pass in a null value or you get a NullPointerException
        String name = "Revature";
        Optional<String> opt = Optional.of(name);

        // If we are not sure if the value we pass in will be null, we can use ofNullable()
        Optional<String> optNullable = Optional.ofNullable(name);
        optNullable = Optional.ofNullable(null);
        // This will not throw an exception
    }

    /*

    Checking Value Presence : isPresent()
    To check if something is present we use isPresent(), it returns true if wrapped value is not null
     */

    public void conditionalPresenceExample(){
        // This is how you would do a null check, to not throw a null pointer exception
        String name = "Name";
        if(name != null){
            System.out.println(name.length());
        }

        // What guarantees are there that after printing the variable, we won't use it again and forget to do a null check?
        // Optional makes you deal with it explicitly, good programming practice
        Optional<String> opt = Optional.of("Name");
        opt.ifPresent(thing -> System.out.println(thing.length()));
    }

    /*
    Default Values with orElse()

    the orElse() method is used to retrieve the value wrapped inside an optional instance
    it takes one paramter which acts as a default value
    the orElse method returns thew rapped value if its present and its argument otherwise
     */

    public void orElseExample(){
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Mike");
        System.out.println(name);
    }
}
