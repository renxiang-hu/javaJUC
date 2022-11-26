package com.heima.thread;

/**
 * 线程join ： 一个线程join方法，只要获取到时间片，就会等这个线程执行完，再去执行其他线程
 * 在线程2 中调用线程1的join方法，当线程调用了这个方法时，线程1会强占CPU资源，直到线程执行结果为止（谁调用join方法，谁就强占cpu资源，直至执行结束）
 */

public class SimpleThread {

    static int counter = 0;

    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ; i++){
                synchronized (lock){
                    counter++;
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ; i++){
                synchronized (lock){
                    counter--;
                }
            }
        }, "t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("counter -- > " + counter);
    }
}
