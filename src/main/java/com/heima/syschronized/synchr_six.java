package com.heima.syschronized;

public class synchr_six {
    public static void main(String[] args) {
       Number5 number = new Number5();
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

class Number5{
    public static synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public static synchronized void b(){
        System.out.println("2");
    }
}
