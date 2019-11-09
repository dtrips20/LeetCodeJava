package com.deetree.leetcode.editor.en;

public class Product_of_Array_Except_Self {

    public static void main(String[] args) {
        Product_of_Array_Except_Self s = new Product_of_Array_Except_Self();
        int[] result = s.productExceptSelf(new int[]{1, 2, 3, 4});

    }

    public int[] productExceptSelf(int[] nums) {

        int ans = 1;
        for (int i : nums) {
            //if (i != 0)
            ans = ans * i;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                nums[i] = 0;
            else
                nums[i] = ans / nums[i];
        }
        return nums;
    }
}
