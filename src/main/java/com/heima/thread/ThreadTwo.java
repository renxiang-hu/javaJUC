package com.heima.thread;

public class ThreadTwo {
    public static void main(String[] args) {
        Thread thread = new Thread(new T1());
        Thread thread1 = new Thread(new T2());
        thread.start();
        thread1.start();
    }
}

class  T1 implements Runnable{

    int tem = 0;
    @Override
    public void run() {
       while (true){
           System.out.println("hello,world");
           ++tem;
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           if (tem == 10){
               break;
           }
       }
    }
}

class T2 implements Runnable{

    int tem = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("hi");
            ++tem;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tem == 5){
                break;
            }
        }
    }
}
