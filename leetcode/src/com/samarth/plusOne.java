package com.samarth;

import java.util.Arrays;

public class plusOne
{
    public static void main(String[] args)
    {
        long c=0;
        long[] arr={9,8,7,6,5,4,3,2,1,9};
        for (int i = 0; i<arr.length ; i++)
        {
            c=(c*10)+arr[i];
        }
        System.out.println(c);
        long a =c+1;
        String s=Long.toString(a);
        int[] d=new int[s.length()];
        for (int i = 0; i <s.length(); i++)
        {
            char ch=s.charAt(i);
            int b=Character.getNumericValue(ch);
            d[i]=b;

        }
        System.out.println(Arrays.toString(d));

    }
}
