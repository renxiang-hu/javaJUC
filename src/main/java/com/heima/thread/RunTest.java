package com.heima.thread;


public class RunTest {
    public static void main(String[] args) {
        Thread thread = new Thread("t1"){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName()+"测试");
            }
        };
        thread.run();
        System.out.println(Thread.currentThread().getName()+"do other things ...");
    }
}
