package com.samarth;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30,40,43,45,56,67,78,88,97,104,158,178,200,223,234,256};
        int target = 7;
        System.out.println(chunk(arr, target));
    }

    static int chunk(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int newStart=start;
        while (end >= start) {
            if (target > arr[end]) {
                newStart = end + 1;
                end = (end-start+1)*2;
            }
            else if (target < arr[end]) {
                int x = binary(newStart, end, arr, target);
                return x;
            }
            if (target == arr[end]) {
                return end;
            }
        }
        return -1;
    }

    static int binary(int start, int end, int[] arr, int target) {
        int mid;
        while (end >= start) {
            mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } if(target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}