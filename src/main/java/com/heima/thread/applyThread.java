package com.heima.thread;

/**
 * 泡茶
 * 一个人洗茶壶1分钟，烧开水15分钟
 * 另一个人洗茶壶、洗茶杯、拿茶叶 4分钟
 * 最后进行泡茶
 */

public class applyThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("烧水壶");
            try {
                Thread.sleep(1000);
                System.out.println("烧开水");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "老王");

        Thread thread2 = new Thread(() -> {
            System.out.println("烧茶壶");
            try {
                Thread.sleep(1000);
                System.out.println("洗茶杯");
                Thread.sleep(2000);
                System.out.println("拿茶叶");
                Thread.sleep(1000);
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("泡茶");
        }, "小王");

        thread1.start();
        thread2.start();
    }
}
