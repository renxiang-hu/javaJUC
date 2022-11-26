package com.heima.syschronized;

public class synchr_five {
    public static void main(String[] args) {
       Number4 number = new Number4();
       new Thread(()->{
           try {
               number.a();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       },"t1").start();
       new Thread(()->{
           number.b();
       },"t2").start();
    }
}

class Number4{
    public static synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }
}
