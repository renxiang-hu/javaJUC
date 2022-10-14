package com.heima.thread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
       Bird bird = new Bird();
       Thread thread = new Thread(bird);
       thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("hello,world");
            Thread.sleep(1000);
        }
    }
}

    class Bird implements Runnable{

        int times = 0;
        @Override
        public void run() {
           while (true){
               System.out.println("hi");
               ++times;
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if (times == 5){
                   break;
               }
           }
        }
    }

