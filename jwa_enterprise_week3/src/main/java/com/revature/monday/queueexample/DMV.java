package com.revature.monday.queueexample;

import java.util.LinkedList;
import java.util.Queue;

public class DMV {

    public static void main(String[] args) {
        Queue<People> registerQueue = new LinkedList<>();
        DMV dmv = new DMV(registerQueue);

        dmv.addToQueue(new People(1, "Mike"));
        dmv.addToQueue(new People(2, "Greg"));
        dmv.addToQueue(new People(3, "Jim"));

        dmv.viewQueue();

        dmv.firstInLine();

        System.out.println(dmv.getNextPerson());

        dmv.firstInLine();

        dmv.viewQueue();

    }

    private Queue<People> registerQueue;

    public DMV(Queue<People> registerQueue) {
        this.registerQueue = registerQueue;
    }

    public void addToQueue(People person){
        this.registerQueue.add(person);
        System.out.println(person + "\nAdded to queue");
        viewQueue();
    }

    public void viewQueue(){
        System.out.println(this.registerQueue);
    }

    public void firstInLine(){
        System.out.println(this.registerQueue.peek());
    }

    public People getNextPerson(){
        // Remove the head of the queue
        return registerQueue.remove();
    }

    public Queue<People> getRegisterQueue() {
        return registerQueue;
    }

}
