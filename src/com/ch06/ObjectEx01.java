package com.ch06;


class Dog extends Object{
    String name = "토토";
}

class Cat {
    String name = "나비";
}


public class ObjectEx01 {
    public static void main(String[] args) {
        Object a1 = new Dog(); // 다형성
        Object a2 = new Cat(); //가능

        Dog d2 = (Dog) a1; // 다운 캐스팅
        Cat c1 = (Cat) a2;

        /*
        Cat c2 = (Cat)a1; // ClassCastException : 캐스팅 문제- 강아지의 오브젝트에서 다운캐스팅은 될수 없다.
        */

        System.out.println(d2.name);
        System.out.println(c1.name );

    }
}
