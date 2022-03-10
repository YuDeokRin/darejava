package com.ch05;

class 전사{
    String name = "전사";

    void 기본공격(궁수 e1){
        System.out.println("검으로 " + e1.name +" 공격하기");
    }

    void 기본공격(광전사 e1){
        System.out.println("검으로 " + e1.name +" 공격하기");
    }
}

class 궁수{
    String name = "궁수";

    void 기본공격(전사 e2){
        System.out.println("활로 " + e2.name + " 공격하기");
    }
}

class 광전사 {
    String name = "광전사";

    void 기본공격(전사 e2){
        System.out.println("도끼로 "+ e2.name  +" 공격하기");
    }
}

class 마법사{
    String name = "마법사";

    void 기본공격(전사 e2){
        System.out.println("마법으로 "+ e2.name  +" 공격하기");
    }
}

class 엘프 {
    String name = "엘프";

    void 기본공격(전사 e2){
        System.out.println("화살로 "+ e2.name  +" 공격하기");
    }
}

class 흑마법사 {
    String name = "흑마법사";

    void 기본공격(전사 e2){
        System.out.println("흑마법으로 "+ e2.name  +" 공격하기");
    }
}

public class OOPEx05 {
    public static void main(String[] args) {
        전사 a = new 전사();
        궁수 b = new 궁수();
        광전사 c = new 광전사();
        마법사 d = new 마법사();
        엘프 e = new 엘프();
        흑마법사 f = new 흑마법사();


        //오버로딩의 장점 : 메소드 이르이 하나여서 기억하기 쉽다
        a.기본공격(c);
        b.기본공격(a);
        c.기본공격(a);
        d.기본공격(a);
        e.기본공격(a);
        f.기본공격(a);
    }

    // 유닛이 100개라면 메소드는 100개 생성해야된다.
}
