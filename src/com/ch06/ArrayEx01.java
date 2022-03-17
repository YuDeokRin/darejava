package com.ch06;


public class ArrayEx01 {
    public static void main(String[] args) {
        int[] nums = new int[3];

        nums[0] = 4;
        nums[1] = 5;

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]); // 배열에 변수를 넣어주지 않으면 0 값이 들어간다.
    }
}
