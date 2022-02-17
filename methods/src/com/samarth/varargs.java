package com.samarth;

import java.util.Arrays;

public class varargs
{
    public static void main(String[] args)
    {
        fun(1,2,3,4,5,6);

    }
    public static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));

    }
}
