package com.company;

class demo implements Runnable{

    Thread t;
    String name;

    demo(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New thread name : "+t);
    }

    public void run(){
        try{
            for(int i = 5; i>0; i--){
                System.out.println(name + " : "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("New thread is interrupted.");
        }
    }

}

public class usingIsaliveAndJoinForThreads {
    public static void main(String[] args) {

        demo d1 = new demo("one");
        demo d2 = new demo("two");
        demo d3 = new demo("three");

        d1.t.start();
        d2.t.start();
        d3.t.start();

        System.out.println("Thread 1 is alive : "+d1.t.isAlive());
        System.out.println("Thread 2 is alive : "+d2.t.isAlive());
        System.out.println("Thread 3 is alive : "+d3.t.isAlive());

        try {
            System.out.println("Waiting for the thread to finish.");

            d1.t.join();  // join() method waits until the thread on which it is called terminates
            d2.t.join();
            d3.t.join();

        } catch(InterruptedException e){
            System.out.println("Main thread is interrupted.");
        }

        System.out.println("Now thread one is alive : "+d1.t.isAlive());
        System.out.println("Now thread two is alive : "+d3.t.isAlive());
        System.out.println("Now thread three is alive : "+d2.t.isAlive());

        System.out.println("Main thread exiting.");

    }
}
