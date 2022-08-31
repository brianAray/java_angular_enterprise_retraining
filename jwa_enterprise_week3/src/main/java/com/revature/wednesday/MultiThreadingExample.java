package com.revature.wednesday;

public class MultiThreadingExample {
    public static void main(String[] args) {
        /*
         * =================================================================
         * ====== THERE ARE TWO MAIN WAYS TO CREATE THREADS ================
         * =================================================================
         *
         * 		(1) Implement Runnable interface and pass it to a new Thread object's constrcutor
         *
         * 		(2) Extend Thread class, and create an object of that class.
         *
         * ================== Both are equal! ====================
         */

        Thread t1 = new NewThread();
        t1.start();

        t1.setPriority(Thread.MAX_PRIORITY);

        // this belongs to the Main Thread
        System.out.println("Hello from the Main thread! Its name is " + Thread.currentThread().getName());

        // 2nd way to create a thread (anonymous class...lambda to provide the functionaloty of the run() method
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                System.out.println("We are now in thread " + Thread.currentThread().getName());

            }

        });

        // how would we do that with a lambda?
        Thread t3 = new Thread(() -> System.out.println("Running from a lambda thread"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.setName("Thread B");

        t2.start();
        /**
         * Thread states:
         *
         * - New
         * - Runnable (its run() method has been implemented)
         * - Running
         * - Non-Runnable (Blocked)
         * - Terminated
         *
         * https://www.google.com/search?q=states+iof+a+thread+java&rlz=1C1GTPM_enUS922US922&oq=states+iof+a+thread+java&aqs=chrome..69i57j0i10i131i433j0i10i433j46i10i433j0i10i131i433j0i10i433j46i10i131i433j0i10j46i10j0i10.2183j0j4&sourceid=chrome&ie=UTF-8
         */

    }

    private static class NewThread extends Thread {

        public void run() {

            System.out.println("Hello from " + this.getName());

        }

    }


}

