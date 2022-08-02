package DesignPatterns;

public class SingletonItem {
    /*
    The singleton design pattern is dealing with creating objects, specifically creating only a single object for the entire lifetime of the
    application

    Basically, a singleton is created once and only once, then reused over and over
     */

    private static SingletonItem singletonItem = null;

    private SingletonItem(){}

    public static SingletonItem getInstance(){
        if(singletonItem == null){
            singletonItem = new SingletonItem();
        }
        return singletonItem;
    }
}
