package com.company;
import java.util.Random;

public class exception {
    public static void main(String args[]){

                 //  nested try statements

        try{
            int a = args.length;
            int b = 23/a;
            System.out.println(a);
            try{
                if(a == 1)
                    a = a / (a-a);
                if(a == 2){
                    int arr[] = new int[2];
                    arr[56] = 45;
                }
            }catch(ArithmeticException e){
                System.out.println("Exception : "+e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }

    }
}
