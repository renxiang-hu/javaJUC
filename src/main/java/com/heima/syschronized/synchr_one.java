package com.heima.syschronized;

import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

public class synchr_one {
    public static void main(String[] args) {
       Number number = new Number();
       new Thread(()->{
           number.a();
       },"t1").start();
       new Thread(()->{
           number.b();
       },"t2").start();
    }
}

class Number{

    public synchronized void a(){
        System.out.println("1");
    }

    public synchronized void b(){
        System.out.println("2");
    }
}
