package com.ch06;

public class ArrayForEx01 {
    static void 남은금액계산(int[] coin, int restMoney){
        for (int i = 0 ; i<coin.length; i++){
            System.out.println(coin[i]+"원 : " + (restMoney/coin[i]));
            restMoney = restMoney%coin[i];
            System.out.println("남은 금액 : " + restMoney);
        }

    }
    public static void main(String[] args) {

        int[] coin = {500, 100, 50, 10};
        int money = 1370;
        int restMoney = money;

       남은금액계산(coin, restMoney);


        /*  아래의 것을 배열과 메소드를 이용해서 리펙토링 해보시오..
        System.out.println(coin[0]+"원 : " + (restMoney/coin[0])); // 180원 남음
        restMoney = restMoney%500;
        System.out.println("남은 금액 : " + restMoney);



        System.out.println(coin[1]+"원 : " + (restMoney/coin[1]));
        restMoney = restMoney%100;
        System.out.println("남은 금액 : " + restMoney);


        System.out.println(coin[2] +"원 :" + (restMoney / coin[2]));
        restMoney = restMoney%50;
        System.out.println("남은 금액 : " + restMoney);


        System.out.println(coin[3]+"원 :" + (restMoney / coin[3]));
        restMoney = restMoney%10;
        System.out.println("남은 금액 : " + restMoney);
         */

   }
}
