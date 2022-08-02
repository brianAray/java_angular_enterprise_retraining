import DesignPatterns.SingletonItem;
import models.Animal;
import models.Calico;
import models.Cat;

import java.lang.ref.SoftReference;

public class References {
    public static void main(String[] args){
        // References
        // Default reference or Strong Reference
        /*
            This is the defualt for any object with an active Strong Reference which means that it is not eligible for GC
            Only when the reference points to a null will it be eligible for GC
         */

        Object simpleRef = new Object();

        simpleRef = null;

        /*
            Weak References, this is not the default and must be explicitly called for
            We can use this in WeakHashMap references for the entry object
            An example use case is with a Database Connection, once you are done with the database in code, then it is automatically
            closed and cleared by the Garbage Collector
         */

        /*
            There are two levels of weak references
            - Soft
                A soft reference means that even if the object is free for GC, it will not be cleared until the JVM decides it needs
                more memory
            - Phantom
                Objects that are being referenced by Phantom References are eligible for GC
                The JVM before removing them will place them in a reference queue
         */

        Integer number = 1;
        SoftReference<Integer> reference1 = new SoftReference(number);

        // Garbage collector is an automated background process (daemon) that clears up objects and memory for you
        // You cannot directly control the GC, it decided for you, but you can offer it choices

        Animal animal = new Animal("Animal", 11, "Grey", 4);

        Cat kitten = new Cat("Cat", 1, "Orange", 4);

        String classStaticItem = Animal.keyword;


        SingletonItem singletonItem = SingletonItem.getInstance();
        SingletonItem singletonItem1 = SingletonItem.getInstance();

        System.out.println(singletonItem == singletonItem1);

    }
}
