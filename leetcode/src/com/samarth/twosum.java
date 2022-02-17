package com.samarth;

import java.util.Arrays;
import java.util.Scanner;

public class twosum
{
    public static void main(String[] args)
    {
        int[] x=new int[2];
        int[] nums={3,3,3,4};
        int target=6;

        for (int i = 0; i <nums.length; i++)
        {
            for (int j = 0; j <nums.length ; j++)
            {
                if(j==i)
                {
                    break;
                }
                else
                {
                    if((nums[i]+nums[j])==target)
                    {
                        x[0]=j;
                        x[1]=i;
                        System.out.println(Arrays.toString(x));

                    }
                }

            }

        }
    }
}
