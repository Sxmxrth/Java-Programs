package com.samarth;

import java.util.Scanner;

public class threedivisors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int a = sc.nextInt();
        System.out.println(isThree(a));
    }

    public static boolean isThree(int n)
    {
        int k=0;
        for (int i = 1; i <=n ; i++)
        {
            if(n%i==0){
                k=k+1;
            }

        }
        if(k==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
