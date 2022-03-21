package com.ch05;

class 요리사 {
    String name = "요리사";
}

class 홍길동 extends 요리사 {
    String name = "홍길동";
}

public class OOPEx03 {
    public static void main(String[] args) {
    홍길동 n1 = new 홍길동(); // 메모리(heap)에서 (홍길동, 요리사) 이렇게 있으면 홍길동을 가리킨다.  n1의 타입은 "홍길동"
        System.out.println(n1.name);

    요리사 y1 = new 홍길동(); // 메모리(heap)에서 (홍길동, 요리사) 이렇게 있으면 요리사를 가리킨다.  y1의 타입은 "요리사"
        System.out.println(y1.name);

    //홍길동 h2 = new 요리사(); // 메모리(haep)에서 (요리사) 이렇게만 있는 상황에서 홍길동의 타입을 사용할 수 없다.
    }
}
