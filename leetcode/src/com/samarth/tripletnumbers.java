package com.samarth;

import java.util.Scanner;

public class tripletnumbers
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number= ");
        int a=sc.nextInt();
        System.out.println(countTriplets(a));

    }
    public static int countTriplets(int n)
    {
        // to store required answer
        int ans = 0;

        // run nested loops for first two numbers.
        for (int i = 1; i <= n; ++i)
        {
            for (int j = i; j <= n; ++j)
            {
                int x = (i * i) +( j * j);

                // third number
                int y =(int) Math.sqrt(x);

                // check if third number is perfect
                // square and less than n
                if (y * y == x && y <= n)
                    ans=ans+2;
            }
        }

        return ans;
    }
}
