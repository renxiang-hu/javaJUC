package com.heima.thread;

public class ThreadTermination{
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination twoPhaseTermination = new TwoPhaseTermination();
        twoPhaseTermination.start();

        Thread.sleep(3500);
        twoPhaseTermination.stop();
    }
}

class TwoPhaseTermination {
    private Thread monitor;
    //启动监控线程
    public void start(){
        monitor = new Thread(()->{
            while(true){
                Thread thread = Thread.currentThread();
                if (thread.isInterrupted()){
                    System.out.println("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("执行监控记录");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    thread.isInterrupted();
                }
            }
        });
        monitor.start();
    }

    //停止监控线程
    public void stop(){
        monitor.interrupt();
    }
}
