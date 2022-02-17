package com.samarth;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st number=");
        int a= sc.nextInt();
        System.out.print("enter 2nd number=");
        int b=sc.nextInt();
        add(a,b);


    }
    public static void add(int x, int y)
    {
        int sum = x+y;
        System.out.println("the sum is= "+sum);
    }
}
