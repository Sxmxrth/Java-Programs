package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={34,67,90,1,3,2,100};
        sort(arr);
    }

    static void sort(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
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
