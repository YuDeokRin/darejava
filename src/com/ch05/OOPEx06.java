package com.ch05;

class 프로토스유닛{
    String name = "프로토스유닛";

    void 기본공격(프로토스유닛 e1){ // 무효화된다.

    }

    String 이름확인(){
        return "?";
    }
}


class 질럿 extends 프로토스유닛{
    String name = "질럿";

    // 오버라이드 = 부모의 메소드를 무효화한다.
    void 기본공격(프로토스유닛 e1){
        System.out.println(this.name+"이 " + e1.이름확인() +"을 공격합니다");
    }

    String 이름확인(){
        return name;
    }


}

class 드라군 extends 프로토스유닛{
    String name = "드라군";

    void 기본공격(프로토스유닛 e1){
        System.out.println(this.name+"이 " + e1.이름확인() +"을 공격합니다.");
    }

    String 이름확인(){
        return name;
    }
}

class 다크템플러 extends 프로토스유닛{
    String name = "다크템플러";

    void 기본공격(프로토스유닛 e1){
        System.out.println(this.name+ "가 " + e1.name +"를 공격합니다.");
    }

    String 이름확인(){
        return name;
    }
}


class 리버 extends 프로토스유닛{
    String name = "리버";

    void 기본공격(프로토스유닛 e1){
        System.out.println(this.name+"가 " + e1.이름확인()+"을 " + "공격합니다.");
    }

    String 이름확인(){
        return name;
    }
}



public class OOPEx06 {
    public static void main(String[] args) {

    프로토스유닛 a = new 질럿(); //(질럿, 프로토스유닛 V)
    프로토스유닛 b = new 드라군(); //(드라군, 프로토스유닛 V)
    프로토스유닛 c = new 다크템플러(); //(다크템플러, 프로토스유닛 V)
    프로토스유닛 d = new 리버();

    a.기본공격(b);
    b.기본공격(c);
    b.기본공격(a);
    a.기본공격(b);
    d.기본공격(a);
    }
}
