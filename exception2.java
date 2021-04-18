package com.company;

 // use of initCause() and getCause() functions

public class exception2 {
    static void demoproc(){
        NullPointerException e = new NullPointerException("top layer.");
        e.initCause(new ArithmeticException("cause"));                 // initCause()
        throw e;
    }
    public static void main (String args[]){
        try{
            demoproc();
        } catch(NullPointerException e){
            System.out.println("caught : "+e);
            System.out.println("Original Cause : "+e.getCause());  // getCause()
        }
    }
}
