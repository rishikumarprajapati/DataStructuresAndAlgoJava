package com.faangPreparation;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
public class TwoSum {
    /*
    --this method returns the elements
    private int[] getTwoSum(int[] nums, int target){
        HashMap<Integer, Boolean> m = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(target - nums[i])){
                res[0] = nums[i];
                res[1] = target - nums[i];
                return res;
            }else{
                m.put(nums[i], Boolean.TRUE);
            }
        }
        return res;
    }

     */

    // this method returns the indexes
    private static int[] getTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                return res;
            }else{
                m.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res =getTwoSum(arr, 9);
        for(int i=0; i<2; i++){
            System.out.println(res[i]);
        }
    }
}
