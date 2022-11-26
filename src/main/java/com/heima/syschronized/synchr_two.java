package com.heima.syschronized;

import lombok.extern.slf4j.Slf4j;

public class synchr_two {
    public static void main(String[] args) {
       Number1 number = new Number1();
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

class Number1{

    public synchronized void a() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }
}
