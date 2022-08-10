package com.heima.thread;

import com.sun.javafx.tools.packager.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.ThreadCreate")
public class ThreadCreate {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("running");
            }
        };
        thread.setName("thread1");
        thread.start();
        System.out.println("run");
    }
}
