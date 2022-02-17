package com.samarth;

import java.util.Arrays;

public class passinginfunctions
{
    public static void main(String[] args)
    {
        int[] n = {1,2,3,4};
        System.out.println(Arrays.toString(n));
        fun(n);
        System.out.println(Arrays.toString(n));

    }
    public static void fun(int[] arr)
    {
        arr[0]=99;


    }
}
