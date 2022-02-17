package com.samarth;

public class pentagonalnumber
{
    public static void main(String[] args)
    {
        pent();

    }
    public static void pent()
    {
        for(int i=1;i<=50;i++)
        {
            int x=(3*i*(i-1)/2)+i;
            System.out.println(x);
        }
    }
}
