package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={45,67,1,2,0,9,23};
        sort(arr);
    }

    static void sort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
