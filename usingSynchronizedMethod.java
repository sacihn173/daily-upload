package com.company;

class callme{

    synchronized void call(String msg){
        System.out.print(" [ "+msg);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("Interrupted.");
        }
        System.out.println(" ]");
    }
}

class caller implements Runnable{
    String msg;
    callme target;
    Thread t;

    caller(callme targ, String s){
        target = targ;
        msg = s;
        t= new Thread(this);
    }

    public void run(){
        target.call(msg);
    }

}

public class usingSynchronizedMethod {
    public static void main(String[] args) {

        callme target = new callme();
        caller t1 = new caller(target, "Hello");
        caller t2 = new caller(target, "World");
        caller t3 = new caller(target, "Synchronized");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch(InterruptedException e){
            System.out.println("Interrupted.");
        }

    }
}

