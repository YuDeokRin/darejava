package com.ch02;

public class MethodEx03 {

    static void VendingMachine1(int coin){
        System.out.println("동전을 투입하였습니다");
    }

    static void VendingMachine2(double paper){
        System.out.println("지페를 투입하였습니다.");

    }
    static void VendingMachine3(String card){
        System.out.println("카드를 투입하였습니다.");
    }

    static void add(int n1, int n2) { //매추변수가 2개
        System.out.println("더하기 메소드가 호출되었습니다.");
        int sum = n1 + n2 ;
        System.out.println(sum);
    }

    public static void main(String[] args) {
     VendingMachine1(10000);
     VendingMachine2(1000.5);
     VendingMachine3("카드 종류");
//     a(5,6);
    }
}
