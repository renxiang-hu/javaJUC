package com.heima.thread;

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread("t1"){
            @Override
            public void run(){
                System.out.println("enter sleep......");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

        Thread.sleep(1000);
        System.out.println("interrupt......");
        thread.interrupt();
    }
}
