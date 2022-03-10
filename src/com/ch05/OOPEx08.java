package com.ch05;

abstract class 육식동물{

    abstract void 공격();

    void 걷기(){
        System.out.println("걷기");
    }
}

class 뱀 extends 육식동물{


    @Override
    void 공격() {
        System.out.println("독으로 공격");
    }
}

class 사자 extends 육식동물{


    @Override
    void 공격() {
        System.out.println("이빨로 공격");
    }
}

public class OOPEx08 {

    public static void main(String[] args) {

    육식동물 a = new 사자();
    육식동물 b = new 뱀();
    a.걷기();
    a.공격();

    b.걷기();
    b.공격();
    }
}
