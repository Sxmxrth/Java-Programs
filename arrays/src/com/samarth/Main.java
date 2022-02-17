package com.samarth;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter element= ");
            int a= sc.nextInt();
            arr[i]=a;
        }

        System.out.println(Arrays.toString(arr));

    }
}
