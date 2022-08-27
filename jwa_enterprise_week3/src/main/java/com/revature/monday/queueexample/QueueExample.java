package com.revature.monday.queueexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++){
            q.add(i);
        }

        System.out.println("Elements of Queue " + q);
    }
}
