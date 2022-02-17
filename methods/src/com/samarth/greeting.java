package com.samarth;

import java.util.Scanner;

public class greeting
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter full name: ");
        String s= sc.nextLine();
        greet(s);

    }
    public static void greet(String m)
    {
        System.out.println("Good morning " + m);
    }
}
