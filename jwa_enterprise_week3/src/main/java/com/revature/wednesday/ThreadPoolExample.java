package com.revature.wednesday;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    /*
    Thread pools allow you to decouple task submission and execution. You have
    the option of exposing an executor’s configuration while deploying an application
    or switching one executor for another seamlessly.

    A thread pool consists of homogenous worker threads that are assigned to execute
    tasks. Once a worker thread finishes a task, it is returned to the pool. Usually,
    thread pools are bound to a queue from which tasks are dequeued for execution by
    worker threads.

    A thread pool can be tuned for the size of the threads it holds. A thread pool
    may also replace a thread if it dies of an unexpected exception. Using a thread
    pool immediately alleviates from the ails of manual creation of threads.

    Important notes about thread pools:

    There’s no latency when a request is received and processed by a thread because
    no time is lost in creating a thread.

    The system will not go out of memory because threads are not created without any limits

    Fine tuning the thread pool will allow us to control the throughput of the system.
    We can have enough threads to keep all processors busy but not so many as to overwhelm the system.

    The application will degrade gracefully if the system is under load.




    A thread pool reuses previously created threads to execute current tasks and offers a
    solution to the problem of thread cycle overhead and resource thrashing. Since the thread
    is already existing when the request arrives, the delay introduced by thread creation is
    eliminated, making the application more responsive.





    Java provides the Executor framework which is centered around the Executor interface,
    its sub-interface –ExecutorService and the class-ThreadPoolExecutor, which implements
    both of these interfaces. By using the executor, one only has to implement the Runnable
    objects and send them to the executor to execute.


    They allow you to take advantage of threading, but focus on the tasks that you want the
    thread to perform, instead of thread mechanics.

    To use thread pools, we first create a object of ExecutorService and pass a set of tasks
    to it. ThreadPoolExecutor class allows to set the core and maximum pool size.The runnables
    that are run by a particular thread are executed sequentially.



    Steps to be followed
    1. Create a task(Runnable Object) to execute
    2. Create Executor Pool using Executors
    3. Pass tasks to Executor Pool
    4. Shutdown the Executor Pool
     */

    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
        // creates five tasks
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown ( Step 4)
        pool.shutdown();
    }
}


// Task class to be executed (Step 1)
class Task implements Runnable
{
    private String name;

    public Task(String s)
    {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run()
    {
        try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d));
                    //prints the initialization time for every task
                }
                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" complete");
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

/*
Risks in using Thread Pools

Deadlock : While deadlock can occur in any multi-threaded program, thread pools introduce another
case of deadlock, one in which all the executing threads are waiting for the results from the blocked
threads waiting in the queue due to the unavailability of threads for execution.

Thread Leakage :Thread Leakage occurs if a thread is removed from the pool to execute a task
but not returned to it when the task completed. As an example, if the thread throws an exception
and pool class does not catch this exception, then the thread will simply exit, reducing the size
of the thread pool by one. If this repeats many times, then the pool would eventually become empty
and no threads would be available to execute other requests.

Resource Thrashing :If the thread pool size is very large then time is wasted in context switching
between threads. Having more threads than the optimal number may cause starvation problem leading
to resource thrashing as explained.

 */