package com.samarth;

public class wealthier {
    public static void main(String[] args) {
        int[][] info={
                {2,3,5},
                {3,6,8,9,13,67},
                {23,6,4,1,0,9}
        };
        int max=0;
        for (int i = 0; i <info.length ; i++) {
            int k=0;

            for (int j = 0; j <info[i].length ; j++) {
                k=k+info[i][j];

            }
            if(k>max){
                max=k;
            }


        }
        System.out.println("the maximum bank acc has the balance="+max);
    }
}
