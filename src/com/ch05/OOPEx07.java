package com.ch05;

//추상클래스
abstract class Animal{

    abstract void speak(); // 추상메소드 (몸체 {}가 없다.) 추상메소드는 상속받은 클래스는 꼭 추상메소드를 구현해야된다.


    //그냥 메소드는 무조건 구현해야하는 의무가 없다.
    void hello(){
        System.out.println("hello");
    }
}

class Cat extends Animal{

    void speak(){
        System.out.println("야옹");
    }
}

class Dog extends Animal{

    void speak(){
        System.out.println("멍멍");
    }
}

/**
 * 새 추가
 */

class Bird extends Animal{

    // 추상메소드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구해야한다.
    @Override
    void speak() {
        System.out.println("짹짹");
    }
}


public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.speak(); // 동적바인딩된다. 이유는 부모의 메소드는 무효화되기때문이다.
        a2.speak();
        a3.speak();
    }
}
