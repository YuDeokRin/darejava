package com.ch05;

/**
 * 인터페이스 : 행위에대한 제약
 */
interface MoveAble{
    // public abstract  부분이 생략되어 있다.
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 냄새맡기();
}

interface MoveAble2{
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 땅바닥으로숨기();
}


/*
 *  추상클래스 : 미완성된 설계도
 */
abstract class 사나운동물 implements MoveAble{
    abstract void 공격();

    @Override // 어노테이션 = JVM이 실행 시에 분석해서 확인 = JVM의 힌트
    public void 냄새맡기() {
        System.out.println("냄새맡기");
    }

    @Override
    public void 위() {
        System.out.println("위로 움직이기");
    }

    @Override
    public void 아래() {
        System.out.println("아래로 움직이기");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 움직이기");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 움직이기");
    }
}

abstract class 온순한동물 implements MoveAble2{
    abstract void 채집();

    @Override
    public void 위() {
        System.out.println("위로 움직이기");
    }
    @Override
    public void 아래() {
        System.out.println("아래로 움직이기");
    }
    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 움직이기");
    }
    @Override
    public void 오른쪽() {
        System.out.println("오른쪽 움직이기");
    }
    @Override
    public void 땅바닥으로숨기() {
        System.out.println("땅바닥으로숨기");

    }
}


class 원숭이 extends 온순한동물{

    @Override
    void 채집() {
        System.out.println("바나나채집");
    }
}

class 소 extends 온순한동물 {

    @Override
    void 채집() {
        System.out.println("풀채집");
    }

}

class 말 extends 온순한동물{

    @Override
    void 채집() {
        System.out.println("풀 채집(말)");
    }
}

class 호랑이 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("이빨로 공격");
    }
}

class 코뿔소 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("뿔로 공격");
    }
}




public class OOPEx09 {

    static void 조이스틱(온순한동물 u1){
        u1.땅바닥으로숨기();
        u1.위();
        u1.아래();
        u1.오른쪽();
        u1.왼쪽();
        u1.채집();
        System.out.println("=====================");
    }

    static void 조이스틱(사나운동물 u1){
        u1.공격();
        u1.위();
        u1.아래();
        u1.오른쪽();
        u1.왼쪽();
        u1.냄새맡기();
        System.out.println("========================");
    }
    public static void main(String[] args) {
        소 u1 = new 소();
        원숭이 u2 = new 원숭이();
        말 u5 = new 말();

        호랑이 u3 = new 호랑이();
        코뿔소 u4 = new 코뿔소();

        조이스틱(u1);
        조이스틱(u2);
        조이스틱(u3);
        조이스틱(u4);
        조이스틱(u5);

        u5.채집();
    }
}
