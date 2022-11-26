package com.heima.syschronized;

public class synchr_three {
    public static void main(String[] args) {
       Number2 number = new Number2();
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
       new Thread(()->{
           number.c();
       },"t3").start();
    }
}

class Number2{

    public synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }

    public void c(){
        System.out.println("3");
    }
}
