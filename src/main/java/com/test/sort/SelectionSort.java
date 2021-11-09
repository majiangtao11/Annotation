package com.test.sort;

/**
 * @author: mjt
 * time:2021-08-27
 * desription:选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,9,3,5,1,7,2,8,6};
        for(int j = 0; j < nums.length; j++){
            int minPos = j;
            for(int i = j + 1; i < nums.length; i++){
                if(nums[minPos] > nums[i]){
                    minPos = i;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[j];
            nums[j] = temp;
        }
        for(int k = 0;k < nums.length;k++){
            System.out.print(nums[k] + " ");
        }
    }
}