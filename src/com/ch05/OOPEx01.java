package com.ch05;

class Player {
    //상태 = 필드
    // 상태 앞에는 접근제어자가 있어야 값을 변경하기 어려워진다.
    // 접근제어자 중 private
    String name; // 이름
    private int thirty; // 목마름/ (0 ~ 100 ) // 외부 클래스에서 접근 불가

    //상태를 초기화 해주기 위해서 생성자 생성
    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    //행위 = 메서드 = 값을 변경
    void 물마시기(){
        System.out.println("물마시기 행위");
        this.thirty = this.thirty - 50;
    }

    int 목마름상태확인(){
        return this.thirty;
    }
}

public class OOPEx01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        System.out.println("이름은 :"+ p1.name);
        System.out.println("갈증지수 : " + p1.목마름상태확인());

        //1. 첫 번쨰 시나리오  = 원입 없이 갈증지수 변경 -> X
        //p1.thirty = 50 ; // 원임없이 갈증지수 변경 = 마법
        //System.out.println("갈증지수 : " + p1.thirty);

        //2. 두 번쨰 시나리오 = 상태가 행위를 변경 -> X
        // X가 나온 이유 : 실수할 수 있다. (필드(상태)의 접근 제어자 : Default)
        //p1.물마시기();
        //System.out.println("갈증지수 : " + p1.thirty);

        //3.세 번쨰 시나리오
        // 2번 시나리오는 상태를 직접 바꾸는 방법이면 3번 시나리오는
        p1.물마시기(); // 실수 할 수 없음.
        System.out.println("갈증지수 : " + p1.목마름상태확인());
    }
}
