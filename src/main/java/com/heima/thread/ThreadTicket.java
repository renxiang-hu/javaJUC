package com.heima.thread;

public class ThreadTicket {
    public static void main(String[] args) {
       SellTicket sellTicket = new SellTicket();
       SellTicket sellTicket1 = new SellTicket();
       SellTicket sellTicket2 = new SellTicket();
        sellTicket.start();
        sellTicket1.start();
        sellTicket2.start();
    }
}

class SellTicket extends Thread{

    private static int ticketNum = 100;

    @Override
    public void run(){
       while (true){
           synchronized (ThreadTicket.class){
               if (ticketNum <= 0){
                   System.out.println("售票结束...");
                   break;
               }
               try {
                   Thread.sleep(50);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + "剩余票数=" + (--ticketNum));
           }
       }
    }
}
