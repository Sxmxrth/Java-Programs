package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr){
        boolean swapped;
        for (int i = arr.length-1; i >0 ; i--) {
            swapped=false;
            for (int j = 0; j <i ; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
}
