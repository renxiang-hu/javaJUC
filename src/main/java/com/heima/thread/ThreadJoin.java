package com.heima.thread;

public class ThreadJoin {
    static int r = 0;

    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    private static void test1() throws InterruptedException {
        System.out.println("开始");
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
            r = 10;
        }, "t1");
        thread.start();
        thread.join();
//        Thread.sleep(1002);
        System.out.println(r);
        System.out.println("结束");
    }
}

