package com.samarth;

public class Main {
    public static void main(String[] args) {
        int[][] wealth = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(wealth));
    }

    static int maximumWealth(int[][] accounts) {
        int total;
        int maximum = 0;
        int[] arr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total = total + accounts[i][j];

            }
//            arr[i]=total;
            if (total > maximum) {
                maximum = total;
            }
        }
        return maximum;
//

    }
}