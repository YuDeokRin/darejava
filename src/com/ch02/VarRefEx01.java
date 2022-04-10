package com.ch02;

// new가 되어서 힙에 할당이 될 떄 사이즈를 알 수 있다.(프로그램이 실행되었을 때 = Runtime)
class MyData {
    int id = 1 ; // 4Byte
    int price = 1000; //4Byte

}


// 레퍼런스(참조) 변수, 일반 변수

// 일반변수는 값을 갖고 있다.
// 데이터를 한번에 찾는다. :  값(바로찾음)
// 이유 : 컴파일시 크기를 알 수 있다.
// 기본자료형 - int, byte, short, long, double, float, boolean, char,

// 레퍼런스변수는 주소를 갖고 있다.
// 데이터를 두번에 찾는다 :  주소 -> 값
// 이유 : 컴파일시 크기를 알 수 없다.
// 클래스 자료형 (bean)

public class VarRefEx01 {
    public static void main(String[] args) {

        //타입 변수; int num; <-- 변수를 선언하다.
        //타입 션수 = 값 ; int num = 10; <-- 변수를 초기화(메모리에 할당)한다.
        int num = 10; // 일반 변수(크기가 정해져 있는 것 = 컴파일 시점(실행하기 전부터 ))
        MyData d = new MyData(); // 레퍼런스변수 (크기가 정해져 있지 않는 것 = 컴파일 시점(실행하기 전부터))
                                 // MyData이 JVM은 실행하기 전까지 무슨타입인지 모른다. 그렇기 때문에 크기를 알 수 없다.
                                 // 실행 할 때(Runtime) 알 수 있다.
        System.out.println(num);
        System.out.println("d.id = " + d.id);
        System.out.println("d.price = " + d.price);

    }
}
