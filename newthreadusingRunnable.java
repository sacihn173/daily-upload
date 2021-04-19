package com.company;

class newThread implements Runnable{
    Thread t;
    newThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread : "+t);
    }
    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("Child thread : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread interrupted.");
        }
        System.out.println("Existing child thread.");
    }
}

public class newthreadusingRunnable {
    public static void main(String args[]){
        newThread th = new newThread();

        th.t.start();

        try{
            for(int i = 5; i>0; i--){
                System.out.println("Main thread : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread existing.");
    }
}
