package com.ch05;
// 오버로딩

class 철수{

    void 달리기(){
        System.out.println("달리기1");
    }

    void 달리기2(int speed) {
        System.out.println("달리기2");
    }

    void 달리기3(double speed) {
        System.out.println("달리기3");
    }

    void 달리기4(int speed, double power) {
        System.out.println("달리기4");
    }

}

public class OOPEx04 {
    public static void main(String[] args) {
        철수 a = new 철수();
        a.달리기();
        a.달리기2(13);
        a.달리기3(123.5);
        a.달리기4(15, 232.3);
    }
}
