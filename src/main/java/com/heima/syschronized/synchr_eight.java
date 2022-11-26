package com.heima.syschronized;

public class synchr_eight {
    public static void main(String[] args) {
       Number7 number = new Number7();
       Number7 number1 = new Number7();
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

class Number7{
    public static synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public static synchronized void b(){
        System.out.println("2");
    }
}
