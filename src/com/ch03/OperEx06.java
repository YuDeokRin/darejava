package com.ch03;

public class OperEx06 {
    public static void main(String[] args) {
        System.out.println(130/100); //몫
        System.out.println(130 % 100);// 나머지

        int money = 130; // 100 1개, 10 3개
        System.out.println("100원 : " + money/100);
        System.out.println("10원 : " + (money%100)/10);
    }
}
