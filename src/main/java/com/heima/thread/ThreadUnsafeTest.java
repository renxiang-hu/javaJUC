package com.heima.thread;

import java.util.ArrayList;

public class ThreadUnsafeTest {

    static final int THREAD_NUMBER = 2;
    static final int LOOP_NUMBER = 200;

    public static void main(String[] args) {
        ThreadUnsafe threadUnsafe = new ThreadUnsafe();
        for (int i = 0; i < THREAD_NUMBER; i++) {
            new Thread(()->{
                threadUnsafe.method1(LOOP_NUMBER);
            },"Thread"+(i+1)).start();
        }
    }
}

class ThreadUnsafe{
    ArrayList<String> list = new ArrayList<>();
    public void method1(int loopNumber){
        for (int i = 0; i < loopNumber; i++) {
            method2();
            method3();
        }
    }

    public void method2(){
        list.add("1");
    }

    public void method3(){
        list.remove(0);
    }
}
