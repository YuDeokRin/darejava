package com.ch06;


class 호랑이 {
    String name = "호랑이";
}

class 사자 {
    String name = "사자";
}


//호랑이, 사자
class 큰바구니<T>{
    T data;
}

    /**
     * Generic은 어떠한 클래스를 만들 때(new 클래스명()) 타입이 정해져 있지 않으면
     * Object로 하면 다운 캐스팅을 매번 해줘야 하기때문에
     * Generic이라는 문법을 사용한다.
     *
     *
     * 자바에서 제네릭(generic)이란 데이터의 타입(data type)을 일반화한다(generalize)는 것을 의미합니다.
     * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법입니다.
     * 이렇게 컴파일 시에 미리 타입 검사(type check)를 수행하면 다음과 같은 장점을 가집니다.
     *
     * 1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있습니다
     * 2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.
     */


public class GenericEx02 {
    public static void main(String[] args) {
        큰바구니<호랑이> s1 = new 큰바구니<호랑이>(); // new 큰바구니<호랑이>(); 인스턴스부분 <호랑이>를 생략해줘도된다. new 큰바구니<>();
        s1.data = new 호랑이();
        System.out.println(s1.data.name);

        큰바구니<사자> s2 = new 큰바구니<>();

    }
}
