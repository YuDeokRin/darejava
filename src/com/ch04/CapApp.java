package com.ch04;

public class CapApp {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // 고양이 한마리가 heap 공간에 만들어짐
        System.out.println(c1.name);
        System.out.println(c1.color);

        Cat c2 = new Cat(); // 고양이 한마리가 heap 공간에 만들어짐
        System.out.println(c2.name);
        System.out.println(c2.color);


        System.out.println("--------------------------------------------------------");
        // new -> 메모리에 할당(heap) --> String name, String color
        // Cat() -> 생성자 호출 > 상태를 초기화하기 위해서
        // c1 -> heap 공간을 가르키는 주소
        // Cat 커스텀 타입(개발자가 만든 타입)
        Cat cat1 = new Cat("뽀삐", "red");  // 고양이 한마리가 heap공간에 만들어짐
        System.out.println("cat = " + cat1.name); //null 자체도 데이터이다. 값이 없음을 의미!
        System.out.println("cat.color = " + cat1.color);

        System.out.println("=========================================================");
        Cat cat2 = new Cat("키키","white"); //고양이 한마리가 heap공간에 만들어짐
        System.out.println("cat = " + cat2.name);
        System.out.println("cat.color = " + cat2.color);
    }
}
