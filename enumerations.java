package com.company;

enum  baverage{
     pizza, burger, maggi, chips, sandwich, kurkure
}

public class enumerations {
    public static void main(String args[]){

        baverage b;
        System.out.println("Baverages are : ");

        baverage arr[] = baverage.values();    // now arr[] contains all enumeration constants of baverage

        for(int i=0; i<arr.length; i++){
            System.out.println(i+1+". "+arr[i]);
        }

        b = baverage.valueOf("chips");

        System.out.println("\nValueOf() says :  "+b);

    }
}
