package com.samarth;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4,7};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int mid=(arr.length-1)/2;
        while(mid<arr.length){
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                mid++;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid-1]){
                mid--;
            }
        }
        return mid;
    }
}
