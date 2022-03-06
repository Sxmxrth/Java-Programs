package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr={1,2,-9,-6,90};
        selection_sort(arr);

    }
    static void selection_sort(int[] arr){

        for (int i =arr.length-1; i >0 ; i--) {
            int max=arr[0],k=0;
            for (int j = 0; j <=i ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    k=j;
                }
            }
            int t=arr[k];
            arr[k]=arr[i];
            arr[i]=t;

        }
        System.out.println(Arrays.toString(arr));

    }
}
