package com.heima.thread;

public class ThreadCreate1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
