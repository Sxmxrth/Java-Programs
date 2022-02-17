package com.samarth;

import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st number=");
        int a= sc.nextInt();
        System.out.print("enter 2nd number=");
        int b=sc.nextInt();
        int s=add(a,b);
        System.out.println("the sum is = "+s);

    }
    public static int add(int x, int y)
    {
        int sum = x+y;
//        System.out.println("the sum is= "+sum);
        return(sum);
    }


}
