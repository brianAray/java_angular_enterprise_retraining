package com.revature.monday.corecollection;

import java.util.Hashtable;
import java.util.Vector;

public class Core {

    /* Framework
        Ready made architecture
        Represents a set of classes and interfaces
        Optional
    */

    /*
    Collection framework?
    Represents a unified architecture for storing and manipulating a group of objects
    it has:
    1. Interfaces and its implementations
    2. Algorithms

    What is the need for it?
     */

    public void needForCollectionAPI(){
        // We create an array, vector and hashtable
        int arr[] = new int[] {1,2,3,4,5};

        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Adding elements to a vector
        vector.addElement(1);
        vector.addElement(2);

        // Adding elements to the hash table
        hashTable.put(1, "Reva");
        hashTable.put(2, "ture");

        // Array instance and creation requires []
        // Vector and hashtable requires ()

        // Vector element insertion requires addElement()
        // Hashtable element insertion requires put()

        // accessing first element of the array, vector, hashtable

        System.out.println(arr[0]);
        System.out.println(vector.elementAt(0));
        System.out.println(hashTable.get(1));


    }

    /*
    None of these collections implement a standard member access interface, making it difficult to write algorithms
    that can work for multiple different types of collections.
    The vector methods are also final, so you cannot extend the vector class.
    Java devs came up with the common Collection interface to deal with this issue

    Advantages
    1. Consistent API, we have the Basic interfaces like Collection, Set, List, Map
        If a class (arraylist linked list etc) implements them then they have some common sets of methods

    2. Reduce programming effort, the focus is not on the data structure design instead on what is best for the program

    3. Increase program speed and quality: performance is improved by using high-performance implementations of useful
    data structures and algorithms.
     */
}
