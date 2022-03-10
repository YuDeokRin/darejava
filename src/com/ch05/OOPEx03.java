package com.ch05;

class 요리사 {
    String name = "요리사";
}

class 홍길동 extends 요리사{
    String name = "홍길동";
}

public class OOPEx03 {
    public static void main(String[] args) {
    홍길동 n1 = new 홍길동();
        System.out.println(n1.name);

    요리사 y1 = new 홍길동();
        System.out.println(y1.name);


    }
}
