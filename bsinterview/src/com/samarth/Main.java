package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] arr = {2,6,9,12,14,16,18};
        System.out.println(bsearch(arr));
    }
    public static int bsearch(int[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to search in the array= ");
        int a = sc.nextInt();
        int s = 0;
        int e = (x.length) - 1;

        while (e >= s)
        {
            int m = s + (e - s) / 2;

            if (a > x[m]) {
                s = m + 1;
            }
            if (a < x[m]) {
                e = m - 1;
            }
            if (a == x[m]) {
                return m;
            }
        }
        return x[s]; //if ceiling, then return s; if floor then return e.

    }
}
