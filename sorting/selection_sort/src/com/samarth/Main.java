package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr={3,2,5,4,1};
        selection_sort(arr);

    }
    static void selection_sort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            int max=0;
            int last=arr.length-i-1;
            for (int j = 1; j <=last ; j++) {

                if(arr[max]<arr[j]){
                    max=j;
                }

            }



        }
        System.out.println(Arrays.toString(arr));
    }
}
