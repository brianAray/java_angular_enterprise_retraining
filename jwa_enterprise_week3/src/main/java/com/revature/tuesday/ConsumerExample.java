package com.revature.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /*
    Consumer interface
    A function which takes 1 arg and produces a result
    These functions don't return a value, so type generic is just T
    T : denotes the type of input args

    Functions in the lambda are accept()

    Consumers are useful when a return is not needed
     */

    public static void main(String[] args) {

        // Consumer to printout number
        Consumer<Integer> display = a -> System.out.println(a);

        display.accept(10);


        // consumer to multiply 2 to every integer in a list
        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i< list.size(); i++){
                list.set(i, 2 * list.get(i));
            }
        };

        // COnsumer to print out list of numbers

        Consumer<List<Integer>> displayList = list -> list.forEach(a -> System.out.println(a));

        List<Integer> list = Arrays.asList(1, 55, 234, 3);

        modify.accept(list);

        displayList.accept(list);


        // We can use andThen() to combine consumers with each other

        modify.andThen(displayList).accept(list);
        // If at any point any of them get a null, then a null pointer will be returned
    }
}

