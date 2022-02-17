package com.samarth;

import java.util.Scanner;

public class sumofint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number= ");
        int a=sc.nextInt();
        sum(a);

    }
    public static void sum(int x)
    {
        int s=0;
        while(x>0)
        {
            int a=x%10;
            s=s+a;
            x=x/10;
        }
        System.out.println("the sum of the digits ="+s);
    }


}
