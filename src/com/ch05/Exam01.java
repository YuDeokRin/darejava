package com.ch05;

interface RemoconAble{
    public void 초록버튼();
    public void 빨간버튼();
}

class Samsung implements RemoconAble{

    @Override
    public void 초록버튼() {
        System.out.println("power on");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("power off");
    }
}

class LG implements RemoconAble{

    @Override
    public void 초록버튼() {
        //내부를 만드시오.
        System.out.println("power on");
    }

    @Override
    public void 빨간버튼() {
        //내부를 만드시오.
        System.out.println("power off");
    }
}




public class Exam01 {
    public static void main(String[] args) {
        //삼성 리모콘 2개 만들기
        Samsung samsung = new Samsung();
        Samsung samsung2 =new Samsung();
        samsung.빨간버튼();
        samsung.초록버튼();
        samsung2.초록버튼();
        samsung2.빨간버튼();

        //LG 리모콘 2개 만들기
        LG lg = new LG();
        LG lg2 = new LG();
        lg.빨간버튼();
        lg.초록버튼();
        lg2.빨간버튼();
        lg2.초록버튼();
    }
}
