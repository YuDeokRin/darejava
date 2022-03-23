package com.ch07;

//타입 :  SubThread -> Runnable(다형성)
class SubThread implements Runnable{
    //자바의 서브 스레드
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("서브스레드 :" + i);
                Thread.sleep(1000); // 1000millis - 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx01 {
    //자바의 메인 스레드
    public static void main(String[] args) {
        SubThread st = new SubThread();
        Thread t1 = new Thread(st); // 타켓 선정  , 타켓을 선정하면서 Thread를 만들어야된다.
        t1.start(); // run 메서드 실행
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("메인 스레드 :" + i);
                Thread.sleep(1000); // 1000millis - 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
