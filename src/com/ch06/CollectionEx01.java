package com.ch06;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {
        // int , double, char, boolean => 기본 자료형(값)
        // String, 커스텀자료형(클래스) -> 레퍼런스자료(참조)
        // 래핑클래스 : Integer, Double, Character, Boolean
        ArrayList<Integer> a1 = new ArrayList<>();

        /*
        int n2 = 1;
        Integer n1 = 2;
        System.out.println(n2);
        System.out.println(n1);
        */

        //값을 넣을 때
        a1.add(1);  // 방법1. 인덱스에 위치에 순서대로 값을 넣는다.
        a1.add(0,2); //방법2. 넣고싶은 인덱스위치를 선정해서 값을 넣어줄 수 있다.
        a1.add(3);
        System.out.println(a1.get(0));
        System.out.println(a1);

        System.out.println("========================================");

        //for반복문 -> fori 하면  int i로 완성된 for문의 형식이 완성되서 나온다.
        //방법1.
        for (int i = 0; i < 3; i++) {
            System.out.println(a1.get(i));
        }
        System.out.println("========================================");

        //방법2. size()메소드를 사용해서 for문 실행
        for (int i = 0; i <a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        //방법2와 같이 한다면 메소드를 여러번 호출하는 것이므로 size()메서드를 변수로 만들어 한번 호출하게 만든다.
        // 방법3.
        System.out.println("========================================");
        int size =a1.size();
        for (int i = 0; i < size ; i++) {
            System.out.println(a1.get(i));
        }

    }
}
