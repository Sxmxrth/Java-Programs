package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how much you want to widthdraw and your balance ");
        double w=sc.nextFloat();
        double b=sc.nextFloat();
        if(w<b && w%5==0){
            b=b-(w+0.5);
            System.out.println(b);
        }
        if(w>b || w%5!=0){
            System.out.println(b);
        }
    }
}
