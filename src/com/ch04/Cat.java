package com.ch04;


public class Cat {
    //값을 초기화 하지않는 이유 : new 할 때마다(동적할당 할 때마다) 다른 상태를 가진 고양이를 만들기 위해서이다.
    String name; // 초기화 x , -> new할 때 마다 heap 공간에 저장
    String color; // 초기화 x,  -> new할 떄 마다  heap 공간에 저장

    //Cat() 생성자를 디폴트 생성자(매개변수가 없는 것)라고 한다.
    // 개발자가 적지 않아도 있는것 (생략 가능한 코드)
    // 디폴트 생성자가 생략이 안될 떄 :  내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
    public Cat() { //생성자(메서드)
        System.out.println("고양이가 탄생함");
    }

    //개발자가 직접 생성자 구현함 = 디폴트 생성자가 생기지 않음.
    public Cat(String n, String c) { // 생성자(메서드)
        System.out.println("고양이 탄생");
        System.out.println("cat1 :" +n);
        System.out.println("cat2 :" +c);

        // String n, String c 는 지역변수 = Cat() 이라는 생성자(메소드)가 가진 지역변수 , String n, String c 는 stack에 있는 저장된 변수
        name =n; // stack 공간 -> heap 메모리로 옮겨준다.
        color =c; // stack 공간 -> heap 메모리로 옮겨준다.

    }
}
