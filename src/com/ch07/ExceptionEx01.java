package com.ch07;

class 총{
    void shoot(){
        System.out.println("총을 발사 했습니다.");
    }
}

public class ExceptionEx01 {
    public static void main(String[] args) {
        //컴파일 예외(Java이 알 수 있음)
        try {
            System.out.println("잠자기 시작");
            Thread.sleep(100); // 메인스레드 1초동안 잠을 잔다.
            System.out.println("잠자기 끝");
        } catch (Exception e) { // 방해
            e.printStackTrace();
        }

        //런타임 예외 (개발자가 알 수 있다)
        int nums[] = {1, 2, 3};

        try {
            System.out.println("nums = " + nums[3]); //강제 종료(에러) : nums변수에 배열 크기에 적합하지 않기때문이다.
        } catch (RuntimeException  e) {
            //catch의 역할은 try(시도)하다가 예외가 발생하면 어떻게 처리할지를 정의하는 영역
            System.out.println("그냥 진행해");

            // x.getMessage()는 "Index 3 out of bounds for length 3" 이렇게 출력한다.
            // 무엇이 틀렸는지 상세한 메시지를 보내준다.
            System.out.println(e.getMessage()); // 나중에 오류들을 로그 파일을 남겨 놓아야한다.
            // printStackTrace는 오류를 추적해주는 로그를 반환해준다.
            e.printStackTrace();
        }

//        String data = null;
//        System.out.println(data.length()); //에러 뜬다. null은 길이를 출력할 수 없다.

//        총 s = new 총();
//        s.shoot();

            총 s = null;
        try {
            s.shoot(); // 에러 : NullPointerException
        } catch (RuntimeException e) {
            System.out.println("총이 없어서 총을 만들고 다시 시도한다. ");
            s = new 총();
            s.shoot();
        }


        System.out.println("main thread end");
    }
}
