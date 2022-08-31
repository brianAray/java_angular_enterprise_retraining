package com.revature.wednesday;

public class MultiThreading {

    /*
    Multithreading is a technique that allows for concurrent (simultaneous) execution
    of two or more parts of a program for maximum utilization of a CPU. As a really basic example,
    multithreading allows you to write code in one program and listen to music in another.
    Programs are made up of processes and threads. You can think of it like this

    A program is an executable file like chrome.exe

    A process is an executing instance of a program.
    When you double click on the Google Chrome icon
    on your computer, you start a process which will
    run the Google Chrome program.

    Thread is the smallest executable unit of a process.
    A process can have multiple threads with one main thread.
    In the example, a single thread could be displaying the
    current tab you’re in, and a different thread could be another tab.

    Developers should make use of multithreading for a few reasons:

    Higher throughput
    Responsive applications that give the illusion of multitasking.
    Efficient utilization of resources. Thread creation is light-weight in
    comparison to spawning a brand new process and for web servers that use
    threads instead of creating a new process when fielding web requests, consume
    far fewer resources.




    Processes are what actually execute the program.
    Each process is able to run concurrent subtasks called threads.

    Threads are sub-tasks of processes and if synchronized correctly
    can give the illusion that your application is performing everything
    at once. Without threads you would have to write one program per task,
    run them as processes and synchronize them through the operating system.



    Concurrency
    Concurrency indicates that more than one thread is making progress,
    but the threads are not actually running simultaneously. The switching
    between threads happens quickly enough that the threads might appear
    to run simultaneously


    Parallelism
    Multithreading on multiple processor cores is truly parallel. Individual
    microprocessors work together to achieve the result more efficiently.
    There are multiple parallel, concurrent tasks happening at once.


    Asynchrony
    Asynchronous programming is a form of parallel programming where a set of
    statements run independently of the main programming flow.

    We use asynchronous programming when we have a blocking operation in the
    program and we want to continue with the execution of the program without
    waiting for the result. This allows us to implement tasks that can run at the same time.


    Synchronizing Resources
    Synchronization in java is the capability to control the access of multiple
    threads to any shared resource. In the Multithreading concept, multiple threads
    try to access the shared resources at a time to produce inconsistent results.
    The synchronization is necessary for reliable communication between threads.


    the correctness of a concurrent program should not depend on accidents of timing.

    Confinement: don’t share data between threads.
    Immutability: make the shared data immutable.
    Use existing threadsafe data types: use a data type that does the coordination for you.

    Synchronization: prevent threads from accessing the shared data at the same time. This is what we use to implement a threadsafe type, but we didn’t discuss it at the time.


    Since race conditions caused by concurrent manipulation of shared mutable data are
    disastrous bugs — hard to discover, hard to reproduce, hard to debug — we need a way
    for concurrent modules that share memory to synchronize with each other.

    Locks are one synchronization technique. A lock is an abstraction that allows
    at most one thread to own it at a time. Holding a lock is how one thread tells
    other threads: “I’m changing this thing, don’t touch it right now.”

    Locks have two operations:

    acquire allows a thread to take ownership of a lock. If a thread tries
    to acquire a lock currently owned by another thread, it blocks until the
    other thread releases the lock. At that point, it will contend with any
    other threads that are trying to acquire the lock. At most one thread can
    own the lock at a time.

    release relinquishes ownership of the lock, allowing another thread to
    take ownership of it.

     */

}
