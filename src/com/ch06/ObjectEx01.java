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
        Object a2 = new Cat(); //가능한 이유 : 모든 클래스는 Object를 상속하고 있다.  그래서 생략해서 extends Object를 잘 사용하지 않는다.

        Dog d1 = (Dog) a1; // a1을 사용하려면 다운 캐스팅을 사용하여 쓸수 밖에없다. a1의 타입은 Object타입이다.
        Cat c1 = (Cat) a2; // a2도 마찬가지이다.

        /*
        Cat c2 = (Cat)a1; // ClassCastException : 캐스팅 문제- 강아지의 오브젝트에서 다운캐스팅은 될수 없다.
        */

        System.out.println(d1.name);
        System.out.println(c1.name );

    }
}
