package com.heima.thread;

public class StartTest {
    public static void main(String[] args) {
        Thread thread = new Thread("t1") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName()+"测试");
            }
        };
        thread.start();
        System.out.println(Thread.currentThread().getName()+" do other thing ...");
    }
}
