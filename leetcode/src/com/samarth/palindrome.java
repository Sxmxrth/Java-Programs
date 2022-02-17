package com.samarth;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number to find whether palindrome or not ");
        int a=sc.nextInt();
        System.out.println(isPalindrome(a));

    }
    public static boolean isPalindrome(int x)
    {
        int z=x;
        int c=0;
        while(x>0)
        {
            int b=x%10;
            c=(c*10)+b;
            x=x/10;
        }

        if(c==z)
        {
            return true;
        }
        return false;
    }
}
