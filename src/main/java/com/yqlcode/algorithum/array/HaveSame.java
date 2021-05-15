package com.yqlcode.algorithum.array;/**
 * 描述:
 * 包名:com.yqlcode.algorithum.array
 * 版本信息: 版本1.0
 * 日期:2021/4/24
 * Copyright 三合力通科技有限公司
 */


import java.util.HashSet;

/**
 * @describe：
 * @author: yql/三合力通科技有限公司 
 * @version:v1.0
 * 2021/4/24 22:07  
 */


public class HaveSame {
    /**
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        boolean res = containsDuplicate(nums);
        System.out.println(res);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
