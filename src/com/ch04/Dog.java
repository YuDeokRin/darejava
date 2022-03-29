package com.ch04;

//클래스 = 여러가지 특징(상태)를 가지고 있다.
//int -> 한가지의 상태만 가질 수 있다.
//String -> 한가지의 상태만 가질 수 있다.

public class Dog {
    int age = 2 ; // 변경 가능
    String name = "토끼"; // 변경 가능
    String color = "흰색";  // 변경가능
    final String type = "말티즈"; // 변경 불가능  -> 해결책 : final 변수를 써서 상수로 만들어 준다 .

    /*  디폴트 생성자는 생략되어있다.
    public Dog() {
    }
     */
}

// 필드, 전역변수(지역변수가 아니다(메서드 내부에서 만들어진 변수가 아니다.)), 상태