package com.samarth;

public class Main {

    public static void main(String[] args) {
        int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=19;
        System.out.println(binarySearch2d(arr,target));
    }

    static boolean binarySearch2d(int[][] arr, int target) {
        int r=0;
        int c=arr[0].length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return true;
            }else if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }

        }

        return false;


    }
}
