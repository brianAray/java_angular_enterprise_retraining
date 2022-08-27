package com.revature.monday.corecollection;

import java.util.*;

public class IteratingExample {

    /*
    The collection framework contains multiple interfaces

    Iterable Interface:
    The root of the entire collection framework
    The main functionality is to provide an iterator for the collection
    It only has one abstract method that is the iterator

    Iterators can be used to iterate through elements one by one
    It is a universal iterator so we can apply it to any collection object
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();


        // Methods
        // hasNext() : returns true if the iteration has more elements
        // next() : returns the next element in the iteration
                    // Throws NoSuchElementException if no more elements present
        // remove() : removes the next element in the iteration. This method can only be called one per call to next()

        int[] integerArray = new int[] {1,2,3,4,5};

        for(int i : integerArray){
            list.add(i);
            queue.add(i);
            set.add(i);
        }

        // After you have added to the collection should you create the iterator

        Iterator listItr = list.iterator();
        Iterator queueItr = queue.iterator();
        Iterator setItr = set.iterator();

        while(listItr.hasNext()){
            Integer i = (Integer) listItr.next();
            System.out.println(i);
        }
        while(queueItr.hasNext()){
            Integer i = (Integer) queueItr.next();
            System.out.println(i);
        }
        while(setItr.hasNext()){
            Integer i = (Integer) setItr.next();
            System.out.println(i);
        }
    }


}
