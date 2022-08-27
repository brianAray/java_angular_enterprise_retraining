package com.revature.tuesday.streams;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {

    /*
    Streams can be created from different element sources e.g. collection or array with the help of stream() and of() methods

    A stream() default method is added to the Collection interface and allows creating a Stream<T> using any collection as an element source:
     */

    public void streamCreate(){
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a", "b", "c");
    }

    /*
    There are many useful operations that can be performed on a stream.

    They are divided into intermediate operations (return Stream<T>) and terminal operations
    (return a result of definite type). Intermediate operations allow chaining.

    It's also worth noting that operations on streams don't change the source
     */

    public void simpleExample(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        long count = list.stream().distinct().count();

        // The distinct method represents an intermediate operation, creating a new stream of unique elements of the
        // previous stream. The count method is a terminal operation which returns the streams size
    }

    // Iterating
    // Helps to substitute for, for-each, and while loops, to allow concentration on operation logic

    public boolean iterationExampleStream(){
        List<String> list = Arrays.asList("1", "123", "5342", "Hello!");

        for (String string : list){
            if (string.contains("1")){
                return true;
            }
        }

        // The above is replaced with one line

        boolean isExist = list.stream().anyMatch(element -> element.contains("1"));

        return false;
    }


    /*
    Filtering

    The filter() method allows us to pick a stream of elements that satisfy a predicate
     */

    public void filterExample(){
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        // Then we can find all the elements of this list with a stream that contains the char 'd', then create a new
        // stream that has only that

        Stream<String> newStream = list.stream().filter(element -> element.contains("d"));
        List<String> onlyDList = newStream.collect(Collectors.toList());
    }


    /*
    Mapping

    Convert elements of a stream by applying a special function to them to collect it into a new stream
    Conversion is key here
     */

    public void simpleMapping(){
        List<String> uris = new ArrayList<>();
        uris.add("C://My.txt");
        Stream<Path> pathsStream = uris.stream().map(uri -> Paths.get(uri));

        /*
        So, the code above converts Stream<String> to the Stream<Path> by applying a
        specific lambda expression to every element of the initial Stream.
         */
    }


    /*
    Reduction

    Stream API allows reducing a sequence of elements to some value according to a specified function with the
    help of the reduce() method of the type Stream
    This method takes two params
    - First value - start
    - Second value - accumulator function
     */

    public void reduceExample(){
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a,b) -> a + b);

        // In this example, we are starting from 23, then we add in every number to the start value
        // 23 (1+1+1)
        System.out.println(reduced);
    }

}
