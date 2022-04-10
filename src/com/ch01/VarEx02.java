package com.ch01;

/**
 * 1. 자바의 모든 코드는 클래스 내부에 존재해야 한다.
 * 2. 자바는 실행 전에 static이라는 키워드를 가지고 있는 것들을 static 메모리 공간에 로드한ㄷ다 .
 * 3. 자바를 실행하면 main에 내부{}를 실행하고 내부{}가 끝나면 종료된다.(자바프로그램)
 * 4. 내부 {}가 끝나면 종료된다.
 */


//에러
//int n3 = 30;

public class VarEx02 {


    int n2 = 20;


    public static void main(String[] args) {
        int n = 10;
        System.out.println(n); // int n = 10 이 실행될 때 10 이라는 숫자가 n1이라는 메모리 공간에 할당된다.
        // 메모리 공간은 static 공간에 할당된다.
        //System.out.println(n2); // Non-static field 'n2' cannot be referenced from a static context
        // static이 아니기 때문에 안된다. 쉽게 말해서 static field(영역)에 없기때문에 에러 난다.
    }

}


/**
 * main() 앞에 static이 없다면 무슨 에러가 나타날까?
 *         -Error: Main method is not static in class com.ch01.VarEx02, please define the main method as:
 *                 public static void main(String[] args)
 *
 *
 */

/*
    public void main(String[] args) {
        int n1 =10 ;
        System.out.println(n1);
    }
*/

