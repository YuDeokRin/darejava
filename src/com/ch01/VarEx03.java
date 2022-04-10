package com.ch01;

public class VarEx03 {
    static int n1 =10;
    static char c1 = 'A';

    public static void main(String[] args) {
        // static 부분에서 에러가 뜬다.
        // 이유는 : Modifier 'static' not allowed here ->즉 static안에 static이라서 안된다.
        // static int num = 500;

    }
}
