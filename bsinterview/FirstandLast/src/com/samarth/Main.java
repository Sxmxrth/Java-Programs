package com.samarth;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums={5,7,7,8,8,10};
        int target=10;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findstartindex){
        int ans=-1;

        //check for first occurrence target
        int end=nums.length-1;
        int start=0;
        int mid;
        while(end>=start){
            mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
