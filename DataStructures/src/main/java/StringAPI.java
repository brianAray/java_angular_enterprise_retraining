public class StringAPI {
    public static void main(String[] args){
        char letter = 'h';
        char letter2 = 'e';
        char letter3 = 'l';
        char letter4 = 'l';
        char letter5 = 'o';

        char[] letters = {letter, letter2, letter3, letter4, letter5};

        System.out.println(letters);

        String word = "hello";

        System.out.println(word);

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);

        /*
        The string represents an array of chars
        All string literals are instances of this class
        Strings are constant, meaning, that when they are created, you cannot change them
         */


        /*
        When you instantiate a class to make an object, you use the new keyword
        But when you use the String API, you do not have to use new when you create a string
         */

        String stringObject = new String("Hello there");

        word = "Hello There";

        System.out.println(stringObject);

        /*
        There are two ways to make a string
        String literal
         */
        String str1 = "Data Science";

        // String New Keyword
        String str2 = new String("Data Science");

        String str3 = "Data Science";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.compareTo(str2));


    }
}
