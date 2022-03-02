package com.ch04;
// this는 자기자신의 heap공간을 가르킨다.
public class People {
    String name;
    int age ;

    // 디폴트 생성자 존재 유 -> .java -> .class 컴파일할 때 자바가

    public People(String name, int age) {
        System.out.println("People 메서드 스택 name :" + name);
        System.out.println("People 메서드 스택 age :" + age);
        this.name =name; // this는 자기자신의 heap공간을 말한다.
        this.age = age;

    }
}
