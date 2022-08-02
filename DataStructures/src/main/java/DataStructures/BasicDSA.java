package DataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BasicDSA {
    /*
    Data Structures are ways of storing and organizing data in a computer.
    The structures have variance based on requirements and performance needs.
    When data is unstructured then there is no defined data model nor is it organized to help any sort of operation or analysis

    Arrays
    Linked Lists
    Stacks
    Queues
    Hash Tables
    Trees
    Heaps
    Graphs

    The main methods of interacting with data structures are in constructed around algorithms:
    They fall under some basics:
    - Traversing
    - Searching
    - Insertion
    - Deletion
    - Sorting
    - Merging

    In order to compare different algorithms against each other, Computer Scientists use Big O notation
     */

    public static void main(String[] args){

        int[] age = {12, 44, 65, 13, 66, 216};

        /*
        Traversing - Print all the arrays one by one
        Insertion - Add an element at the given index
        Deletion - Deletes an element at the given index
        Search - Searches an element using the given index or value
        Update - Updates an element at the given index
         */

        //Traversal
        for(int i = 0; i < age.length ; i++){
            System.out.println(age[i]);
        }

        //Insertion
        int[] numbers = new int[10];

        numbers[3] = 11;

        //Update
        age[0] = 44;

        System.out.println(age[0]);

        /*
        Array Indexing Strategies
         */

        // First and Last element
        // first
        System.out.println(age[0]);
        // last
        System.out.println(age[age.length - 1]);

        // Random Value
        int randValue = age[new Random().nextInt(age.length)];

        // Append a new item
        int[] oldArray = {12, 124, 523, 5234, 634, 6346};
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);

        newArray[newArray.length - 1] = 555;


        // Multi Dimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4} , {5, 6, 7, 8}, {1}};

        System.out.println(myNumbers[2][0]);


        VarArgsThing varArgsThing = new VarArgsThing();

        varArgsThing.printOutNames(40, "Greg", "Mike", "Jones", "Niel", "Sarah");

    }
}
