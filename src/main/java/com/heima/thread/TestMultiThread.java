package com.heima.thread;

public class TestMultiThread {

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while(true){
                System.out.println("t1 running");
            }
        },"t1").start();
        Thread.sleep(500);
        new Thread(()->{
            while(true){
                System.out.println("t2 running");
            }
        },"t2").start();
    }
}
