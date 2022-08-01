import Recipes.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Car redCar = new Car(4, "Red");
        Car blueCar = new Car(2, "Blue");
        redCar.setWheelNumber(0);

        System.out.println(blueCar);
        System.out.println(redCar);

        Person person1 = new Person("Greg", "Black", 33, 180);

        System.out.println(person1);

        // Java uses wrapper classes to "wrap" around a primitive and let you treat it like its an object


        // Mathematical operators are used in all languages
        // Common ones are : + - = / % > <
        // Equals or = is the assignment operator
            // This means, that a reference is assigned a value using that operator
        // Addition operator : +
            // This is also used for concatenation
        /*

    Arithmetic operators
        + for adding numbers
        - for minusing numbers
        * for multiplication
        / Division
        % Modulus
        ++ increment
        -- Decrement
    Assignment operators
    Comparison operators
    Logical operators
    Bitwise operators

         */

        System.out.println(10 / 2);
        System.out.println(10 % 2);

        System.out.println(10 % 3);

        int num1 = 10;

        System.out.println(num1);
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println(--num1);


        // Assignment Operators
        int num2 = 15;

        num2 = 15 + 5;

        System.out.println(num2);

        num2 += 5;

        System.out.println(num2);

        num2 -= 10;

        System.out.println(num2);

        // Comparison Operators
        // == Equal to
        // != Not Equal to
        // > Greater than
        // < Less than
        // >= Greater than or equal to
        // <= Less than or equal to

        int original = 1000;
        int comparison = 200;

//        System.out.println(original == comparison);
//        System.out.println(original != comparison);
//        System.out.println(original > comparison);
//        System.out.println(original < comparison);
//        System.out.println(original >= comparison);
//        System.out.println(original <= comparison);

        Person originalJake = new Person("Jake", "Blonde", 70, 177);
        Person cloneJake = new Person("Jake", "Blonde", 70, 177);

        System.out.println(originalJake.equals(cloneJake));

        boolean test = false; // same as 0
        boolean test2 = true; // same as 1

        // Control flow allows you to dictate the flow of the program based on various contexts
        // if - an if block evaluates a value to see if it is true or false (1 or 0) and if it is true then the block
        // of code is run

        if(test2){
            System.out.println("This is true");
        }

        if(original >= comparison){
            System.out.println("Original value: " + original + " is greater than or equal to Comparison value: " + comparison);
        }else if(original == 100){
            System.out.println("The value is: " + 100);
        }else{
            System.out.println("Original value: " + original + " is less than or equal to Comparison value: " + comparison);
        }

        if(original == 100 && original > comparison){
            System.out.println("Original is 100 and it is less than the comparison value");
        }

        if(original == 100 || comparison == 200){
            System.out.println("This worked");
        }


    }
}
