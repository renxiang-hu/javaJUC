package com.heima.syschronized;

public class synchr_seven {
    public static void main(String[] args) {
       Number6 number = new Number6();
       Number6 number1 = new Number6();
        new Thread(()->{
           try {
               number.a();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       },"t1").start();
       new Thread(()->{
           number1.b();
       },"t2").start();
    }
}

class Number6{
    public static synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }
}
