package com.heima.thread;

import java.util.ArrayList;

public class ThreadInterTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("sleep......");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");
        thread.start();
        System.out.println(thread.isInterrupted());
        thread.interrupt();
    }
}
