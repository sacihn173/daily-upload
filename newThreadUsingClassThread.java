package com.company;

class newthrea extends Thread{

    newthrea(){
        super("Demo thread");           // creating a new thread
        System.out.println("Child thread : "+this);
    }
    public void run(){                 // necessary to define run() method 
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child thread : "+i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Child thread is interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class newThreadUsingClassThread {
    public static void main(String args[]){

        newthrea t = new newthrea();      // create a new thread
        t.start();                 //  using the start statement to start the new thread --> starts the run() method defined in class

        try{                            // performing for main thread
            for(int i=5; i>0; i--){
                System.out.println("Main thread : "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Main thread is interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}
