package com.heima.thread;

public class ThreadStart {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}


class Cat extends Thread{
    @Override
    public void run(){
        System.out.println("我是小猫咪");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
