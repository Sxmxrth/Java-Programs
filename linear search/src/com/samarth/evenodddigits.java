package com.samarth;

public class evenodddigits {
    public static void main(String[] args) {

        int[] nums={12,456,2,5,7896};
        for (int i = 0; i <nums.length ; i++) {
            int k=0;
            while(nums[i]>0){

                nums[i]=nums[i]/10;
                k=k+1;
            }
//            System.out.println("the number of digits in the " + i +" index is "+k);
            if(k%2==0){
                System.out.println("the number of digits in the " + i +" index is even");
            }
            else{
                System.out.println("the number of digits in the " + i +" index is odd");
            }

        }
    }
}
