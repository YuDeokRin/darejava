package com.ch06;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}}; // [2][3] : 행 2 개 , 열 3개
        System.out.println(nums[0][0]);
        System.out.println(nums[0][2]);
        System.out.println(nums[1][1]); // 5

        int[][] nums2 = new int[2][2];
        nums2[0][0] = 1;
        nums2[0][1] = 2;
        nums2[1][0] = 3;
        nums2[1][1] = 4;

        System.out.println(nums2[1][0]);


    }


}
