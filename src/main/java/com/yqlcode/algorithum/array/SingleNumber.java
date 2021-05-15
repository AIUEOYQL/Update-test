package com.yqlcode.algorithum.array;/**
 * 描述:
 * 包名:com.yqlcode.algorithum.array
 * 版本信息: 版本1.0
 * 日期:2021/4/24
 * Copyright 三合力通科技有限公司
 */


import java.util.Arrays;

/**
 * @describe：
 * @author: yql/三合力通科技有限公司 
 * @version:v1.0
 * 2021/4/24 22:18  
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,1,2};
        System.out.println(singleNumberOr(nums));

    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0 ; i < nums.length - 1; i ++) {
            if ( nums[i] != nums [i + 1]) {
                return nums[i];
            }
            i += 1;
        }
        return nums[nums.length - 1];

    }

    /**
     * 0^任意数 = 任意数  任意数 亦或 任意数 = 0  亦或满足交换率和结合率 即 a ^ b ^ a = a^a^b = b
     * @param nums
     * @return
     */
    public static int singleNumberOr(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
