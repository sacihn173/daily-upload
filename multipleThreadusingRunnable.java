package com.company;

class demoThread implements Runnable{

    Thread t;
    String name;

    demoThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread : "+this);
    }

    public void run(){
        try{
            for(int i = 0; i<5; i++){
                System.out.println(name+" : "+i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("New thread created is interrupted.");
        }
    }
}

public class multipleThreadusingRunnable{
    public static void main(String args[]){

         // creating multiple objects of class demoThread to create multiple threads
        demoThread t1 = new demoThread("One");
        demoThread t2 = new demoThread("Two");
        demoThread t3 = new demoThread("Three");

         // multiple start() statements to call the run function for each thread from the class demoThread
        t1.t.start();
        t2.t.start();
        t3.t.start();

         // for main thread
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e ){
            System.out.println("Main thread is interrupted.");
        }
        System.out.println("This delay was due to the main thread.");
    }
}
