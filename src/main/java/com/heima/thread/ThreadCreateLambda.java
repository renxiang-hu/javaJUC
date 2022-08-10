package com.heima.thread;

public class ThreadCreateLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("running");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
