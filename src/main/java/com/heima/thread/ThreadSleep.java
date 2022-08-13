package com.heima.thread;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread = new Thread("t1"){
            @Override
            public void run(){
                try {
                    System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println(Thread.currentThread().getName()+thread.getState());
        thread.start();
        System.out.println(Thread.currentThread().getName()+thread.getState());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+thread.getState());
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
    }
}
