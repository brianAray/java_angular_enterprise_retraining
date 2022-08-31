package com.revature.wednesday;

public class LockExample implements Runnable{

    /*
    Every object in java has a unique lock. Whenever we are using a synchronized keyword,
    then only the lock concept will come into the picture. If a thread wants to execute a
    synchronized method on the given object. First, it has to get a lock of that object.
    Once the thread got the lock then it is allowed to execute any synchronized method on
    that object. Once method execution completes automatically thread releases the lock.
    Acquiring and release lock internally is taken care by JVM and the programmer is not
    responsible for these activities

    WAYS TO MAKE A LOCK

    public class GeekClass
{
    public synchronized void GeekMethod(){}
}

public class GeekClass
{
    public void GeekMethod(){
        synchronized (this)
        {
            // other thread safe code
        }
    }
}

public class DemoClass
{
    private final Object lock = new Object();
    public void demoMethod(){
        synchronized (lock)
        {
            // other thread safe code
        }
    }
}

     */

    // Method of this class
    public void run() { Lock(); }

    /*
     Synchronization of non-static methods
     (object lock) as different synchronized
     non-static methods are called in both threads

     Then both threads need to acquire the object lock
     After one is acquired, the other thread must wait
     for one thread to finish the executing
     before the other thread starts to execute.

     */

    public void Lock()
    {
        System.out.println(
                Thread.currentThread().getName());
        synchronized (this)
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of above class
        // in the main() method
        LockExample g = new LockExample();

        // Sharing the same object across two Threads

        // Here, t1 takes g
        Thread t1 = new Thread(g);

        // Here, t2 takes g
        Thread t2 = new Thread(g);

        // Creating another object of above class
        LockExample g1 = new LockExample();

        // Here, t3 takes g1
        Thread t3 = new Thread(g1);

        // setname() method is used to change
        // name of the thread
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        // start() method beginning the execution of threads
        // as JVM calls the run() method of thread
        t1.start();
        t2.start();
        t3.start();
    }
}
