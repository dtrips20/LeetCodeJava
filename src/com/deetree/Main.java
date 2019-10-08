package com.deetree;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println(m.Helper(num,0,num.length-1));
        System.out.println(m.BruteForce(num));
    }

    private int BruteForce(int[] num)
    {

        int curmax = 0 ;
        int totalmax = 0 ;

        for(int i = 0 ; i<= num.length -1 ; i++)
        {
            curmax = curmax + num[i];

            if ( curmax < 0 )
                curmax = 0 ;
            else
                totalmax = Math.max(totalmax,curmax);



        }

        return totalmax;

    }

    private int Helper(int[] num, int left , int right)
    {

        if(num[left] == num[right])
        {

            return num[left];

        }

        int p = (left+right)/2;

        int leftSum = Helper(num,left,p);
        int rightSum = Helper(num,p+1,right);
        System.out.println("p="+p);
        System.out.println("Left="+left);
        System.out.println("Right="+right);
        System.out.println("Left Sum="+rightSum);
        System.out.println("Right Sum="+leftSum);


        int crossSum = crossSum(num, left, right, p); ;
        System.out.println("Cross Sum="+crossSum);
        System.out.println(" ");
        return Math.max(Math.max(rightSum,leftSum),crossSum);

        //return (leftSum+rightSum);

    }

    public int crossSum(int[] nums, int left, int right, int p) {
        if (left == right) return nums[left];

        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = p; i > left - 1; i--) {
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = p + 1; i < right + 1; i++) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum;
    }

}
