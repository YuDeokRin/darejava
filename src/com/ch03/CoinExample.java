package com.ch03;

public class CoinExample {
    public static void main(String[] args) {


        int money = 3680;
        int restMoney = money;

        int count500 = restMoney/500;

        System.out.println("500원 : " + (restMoney/500)); // 180원 남음
        restMoney = restMoney%500;
        System.out.println("남은 금액 : " + restMoney);


        int count100 = restMoney/100;
        System.out.println("100원 : " + (restMoney/100));
        restMoney = restMoney%100;
        System.out.println("남은 금액 : " + restMoney);

        int count50 = restMoney/50;
        System.out.println("50원 :" + (restMoney / 50));
        restMoney = restMoney%50;
        System.out.println("남은 금액 : " + restMoney);

        int count10 = restMoney/10;
        System.out.println("10원 :" + (restMoney / 10));
        restMoney = restMoney%10;
        System.out.println("남은 금액 : " + restMoney);


        System.out.println("--------------------------------");
        System.out.println(money + "의 최소동전의 개수는?");
        System.out.println("500원"+count500 +"개");
        System.out.println("100원"+count100+"개");
        System.out.println("50원"+count50+"개");
        System.out.println("10원"+count10+"개");

    }
}
