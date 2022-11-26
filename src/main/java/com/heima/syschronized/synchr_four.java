package com.heima.syschronized;

public class synchr_four {
    public static void main(String[] args) {
       Number3 number = new Number3();
       Number3 number1 = new Number3();
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

class Number3{

    public synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }

}
