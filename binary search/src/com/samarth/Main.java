package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bsearch(arr);
    }
    public static void bsearch(int[] x){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number to search= ");
        int a =sc.nextInt();
        int l=x.length;

        if(a>x[l/2]){
            for (int i = (l/2)+1; i <l ; i++) {
                if(a==x[i]){
                    System.out.println("the number is present in the array at index="+i);
                }

            }
        }
        if(a<x[l/2]){
            for (int i = 0; i <(l/2)+1 ; i++) {
                if(a==x[i]){
                    System.out.println("the number is present in the array at index="+i);
                }

            }
        }
        if(a==x[l/2]){
            int m=l/2;
            System.out.println("the number is present in the array at index="+m);
        }
    }
}
