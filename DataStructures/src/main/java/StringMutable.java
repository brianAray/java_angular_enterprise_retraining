public class StringMutable {
    public static void main(String[] args){
        /*
        Java provides two classes to work with mutable strings
        String Buffer
        The string buffer is synchronized, which means it is thread safe
        STringBuffer is less efficient
        StringBuffer was introduced in Java 1.0


        String Builder
        Is not synchronized so it is not thread safe
        StringBuilder is more efficient than StringBuffer
        It was introduced in 1.5
         */

        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");

        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println(builder);


        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for(int i = 0; i < 100000; i++){
            sb.append("Revature");
        }
        System.out.println("Time taken by StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for(int i = 0; i < 100000; i++){
            sb2.append("Revature");
        }
        System.out.println("Time taken by StringBuilder is: " + (System.currentTimeMillis() - startTime2) + "ms");


    }
}
