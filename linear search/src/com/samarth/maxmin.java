package com.samarth;

public class maxmin
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,100,-3};
        max(arr);
        min(arr);

    }
    public static void max(int[] m)
    {
        int t=m[0];
        for (int i = 0; i < m.length-1 ; i++)
        {
            int a = m[i];
            int b = m[i+1];
            if(a>b)
            {
                if(a>=t)
                {
                    t=a;
                }
            }
            else
            {
                if(b>t)
                {
                    t=b;
                }
            }
        }
        System.out.println("the greatest number in the array is "+ t);
    }
    public static void min(int[] m)
    {
        int t=m[0];
        for (int i = 0; i < m.length-1 ; i++)
        {
            int a = m[i];
            int b = m[i+1];
            if(a<b)
            {
                if(a<=t)
                {
                    t=a;
                }
            }
            else
            {
                if(b<t)
                {
                    t=b;
                }
            }
        }
        System.out.println("the smallest number in the array is "+ t);
    }

}
