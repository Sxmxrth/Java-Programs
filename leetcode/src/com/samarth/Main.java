package com.samarth;

public class Main {

    public static void main(String[] args) {
	    int[] arr={3,3};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if(max<arr[i+1]){
                max=arr[i+1];
            }
            if(min>arr[i+1]){
                min=arr[i+1];
            }

        }
        int k=0;
        for (int i =1; i <=min ; i++) {
            int a =max%i;
            int b=min%i;
            if(a==0 && b==0){
                k=i;

            }
        }
        System.out.println("the greatest common divisor is "+ k);
    }
}
