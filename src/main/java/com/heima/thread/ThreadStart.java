package com.heima.thread;

public class ThreadStart {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        //说明：当main线程启动一个子线程 Thread-0 , 主线程不会阻塞，会继续执行
        //主线程不会阻塞，主线程和子线程交替执行
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}


class Cat extends Thread{
    int times = 0;
    @Override
    public void run(){
        while (true){
            System.out.println("我是小猫咪"+(++times) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80){
                break;
            }
        }
    }
}
