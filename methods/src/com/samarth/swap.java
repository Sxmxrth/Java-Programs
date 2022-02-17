package com.samarth;

public class swap
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a + " " +b);

    }
    public static void swap(int x, int y)
    {
        int t=x;
        x=y;
        y=t;



    }
}
