package com.ch04;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog(); // heap 공간에 올린다.
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.color = " + dog.color);
        System.out.println("dog.type = " + dog.type);

        System.out.println("------------------------------------------");
        //1년 후 강아지가 노란색으로 염색,이름도 변경
        dog.age = dog.age + 1  ;
        dog.color = "노란색";
        dog.name = "키키";
        //dog.type = "푸들";  //변경 불가 이유 : Cannot assign a value to final variable 'type' 이라고 에러가 뜬다.
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.color = " + dog.color);
        System.out.println("dog.type = " + dog.type);
    }
}
