package com.samarth;

import java.util.Scanner;

public class searching2darr
{
    public static void main(String[] args) {
        int[][] arr={
                {12,34,56},
                {57,78,0},
                {23,8,16}
        };
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number to search in the array=");
        int a=sc.nextInt();
        for (int i =0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(a==arr[i][j])
                {
                    System.out.println("number found at index "+i +" " +j);
                    break;
                }
            }

        }
    }
}
