package com.ch04;

public class Cat {
    String name; // 초기화 x , heap 공간에 저장
    String color; // 초기화 x  heap 공간에 저장

    //Cat() 생성자를 디폴트 생성자(매개변수가 없는 것)라고 한다.
    // 개발자가 적지 않아도 있는것 (생략 가능한 코드)
    public Cat() {
    }

    // 내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
    public Cat(String n, String c) { // 생성자(메서드)
        System.out.println("고양이 탄생");
        System.out.println("cat1 :" +n);
        System.out.println("cat2 :" +c);

        // String n, String c 는 지역변수 = Cat() 이라는 생성자(메소드)가 가진 지역변수 , String n, String c 는 stack에 있는 저장된 변수
        name =n; // stack 공간 -> heap 메모리로 옮겨준다.
        color =c; // stack 공간 -> heap 메모리로 옮겨준다.

    }
}
