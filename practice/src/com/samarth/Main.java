package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number=");
        int a =sc.nextInt();
        System.out.print("enter second number=");
        int b =sc.nextInt();
        System.out.print("enter third number=");
        int c =sc.nextInt();
        find(a,b,c);

    }
    public static void find(int x, int y, int z)
    {
        if(x>y)
        {
            if(x<z)
            {
                System.out.println(z + " "+ "is the greatest number amongst these");
            }
            else
            {
                System.out.println(x + " "+ "is the greatest number amongst these");
            }

        }
        else
        {
            if(y>z)
            {
                System.out.println(y + " "+ "is the greatest number amongst these");
            }
            else
            {
                System.out.println(z + " "+ "is the greatest number amongst these");

            }
        }


    }
}
