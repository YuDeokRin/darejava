package com.ch06;

public class ConEx04 {
    public static void main(String[] args) {

        //1번
        for (int i = 1 ; i<=10; i++){
            if (i!=6){
                System.out.println(i);
            }
        }
        System.out.println("========================");

        //2번
        for (int i = 10 ; i>0; i--){
            if (i!=3){
                System.out.println(i);
            }
        }
        System.out.println("========================");

        //3-1
        for (int num = 1 ; num<21; num++){
            if(num%2==0){
                System.out.println(num);
            }
        }
        //3-2
        System.out.println("========================");
        for (int num = 2; num < 21; num=num+2){
            System.out.println(num);
        }
    }
}
