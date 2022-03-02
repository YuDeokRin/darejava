package com.ch04;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.color = " + dog.color);
        System.out.println("dog.type = " + dog.type);

        System.out.println("------------------------------------------");
        //1년 후 강아지가 노란색으로 염색
        dog.age = dog.age + 1  ;
        dog.color = "노란색";
        dog.name = "키키";
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.color = " + dog.color);
        System.out.println("dog.type = " + dog.type);
    }
}
