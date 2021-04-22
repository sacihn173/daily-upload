package com.company;
import java.lang.*;

enum products {
     shoes(10) , car(100) , hat(2) , bat(20) , mat(27) , flat(1000);

    private int price;
    int space = 3;

    products(int p){
        price = p;
    }

    int showPrice(){
        return price;
    }

}

public class enumeration2 {
    public static void main(String args[]){

        for(products d : products.values()){
            System.out.println("Price of "+d+": "+d.showPrice());
        }

    }
}
