package com.ch02;


/**
 * 정리 : Stack(지역변수 = 메서드가 실행될 때 메모리에 할당된다 = 메서드가 종료될 때 메모리에서 사라진다.)  생명주기 : 가장 짧음(상대적)
 *     : Heap(전역변수  = new할 때 메모리에 할당 된다. = 더 이상 참조하지 않을 때 메모리에서 사라진다.)  생명주가 : 중간 (상대적)
 *     : Static(전역변수 = main메서드가 실행되기 전에 메모리에 할당 된다. = main메서드가 종료되면 메모리에서 사라진다.) 생명주기 : 가장 길다(상대적)
 */

public class StackEx02 {

    static int sum = 20 ;  // 전역변수(static) main메서드가 시작되기 전에 sum이 할당된다.
    int value = 50 ; // 전역변수(heap) - 더 이상 참조하지 않을 때 자동으로 사라진다.

    static void a(){
        //a 메서드가 실행될 때 stack 공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라진다.
        int n1 = 1; // a 메서드의 스택영역에 저장됨(지역변수) (stack)
        System.out.println(n1);

        // 21번 라인이 실행되려고 할 때 static 공간에 할당해야 하는데 불가능하다. static공간 할당은 main메서드 실행전에만 가능하다.
        //static int n2 = 2 ;
    }

    public static void main(String[] args) {
        a(); //메서드를 호출한다.
//        System.out.println(n1);
        System.out.println(sum);
        StackEx02 s = new StackEx02(); // 17번 라인에서 heap공간에 value가 할당된다.
        System.out.println(s.value);
        System.out.println("test1 - 더 이상 s 변수를 참조하지 않기 때문에 메모리에서 사라진다.");
        System.out.println("test2");
    }
}
