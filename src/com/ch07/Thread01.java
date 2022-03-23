package com.ch07;

/** <p>
 *  이 내용은 Searching(TCP School.com 참고)을 통해서 정리 <br>
 * Thread를 알기 전에 Process라는 숙지하면 Thread를 더 이해하기 쉽다.<br>
 * </p>
 *
 * <p>
 * -프로세스(Process)란?<br>
 * 단순히 바라본다면 실행 중인 프로그램(program)이라고 할 수 있다. <br>
 * 즉, 사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것을 말한다. <br>
 * 이러한 프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성된다. <br>
 * </p>
 *
 * <p>
 * -스레드(Thread)란? <br>
 * 스레드란 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다. <br>
 * 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행한다.<br>
 * 또한, 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스(multi-threaded process)라고 한다.<br>
 * <p/>
 *
 *
 * <p>
 * -스레드의 생성과 실행 <br>
 *  자바에서 스레드를 생성하는 방법 <br>
 *  방법1. Runnable 인터페이스를 구현하는 방법<br>
 *  방법2. Thread 클래스를 상속받는 방법<br>
 * </p>
 *
 * 두 방법 모두 스레드를 통해서 작업하고 싶은 내용을 run() 메소드에 작성하면 된다.
 *
 */


// Runnable 인터페이스는 무조건 run()메소드를 오버라이드 해야된다.
class ThreadWithRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); //현재 실행 중인 스레드의 이름을 반환함.
            try {  // srround With  단축키 - Option + Command + T
                Thread.sleep(10); // 0.01초간 스레드를 멈춤
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class ThreadWithClass extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Thread01 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법
        ThreadWithClass  thread2 = new ThreadWithClass(); // Thread 클래스를 상속받는 방법

//        thread1.setPriority(10); // Thread-1의 우선순위를 10으로 변경함  1 ~ 10 까지 있다.

//        thread1.start(); //Thread-0 실행
        thread2.start(); //Thread-1 실행


        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());

        /**
         * main()메소드를 실행하는 스레드의 우선순위는 언제나 5이므로, main()메소드 내에서 생성된 스레드 Thread-0의 우선순위는 5로 설정되는 것을 확인할 수 있다.
         *
         * 74라인에서 Thread-0이 먼저 실행되고, 75라인에서 Thread-1이 나중에 실행된다.
         * 따라서 만약 72번라인(setPriority)이 존재하지 않는다면, Thread-0이 먼저 실행되고, Thread-1이 나중에 실행될 것이다.
         * 하지만 72번라인(setPriority)에서 Thread-1의 우선순위를 10으로 변경했기 때문에, Thread-1이 나중에 실행됐더라도 우선순위가 Thread-0보다 높아 먼저 실행되는 것이다.
         */
    }
}
