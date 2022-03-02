package com.ch02;


class Guest {

    //손님의 행위
    void function(){
        System.out.println("손님이 커피를 마셔요.");
    }
}



public class MethodEx01 {

    // 메서드 = MethodEx01 클래스의 행위
    static void start(){

        System.out.println("만나서 반갑습니다. "); // String 타입
        System.out.println("start 메서드 종료"); //

    }

    public static void main(String[] args) {
     MethodEx01.start();
        Guest g = new Guest();
        g.function();
    }
}
