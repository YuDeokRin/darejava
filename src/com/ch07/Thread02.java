package com.ch07;

/**
 * -멀티스레드(multi-thread)
 * 멀티스레드란 하나의 프로세스 내에서 둘 이상의 스레드가 동시에 작업을 수행하는 것을 의미합니다.
 *
 * -멀티프로세스(multi-process)
 * 여러 개의 CPU를 사용하여 여러 프로세스를 동시에 수행하는 것을 의미합니다.
 *
 * -멀티스레드와 멀티프로세스는 여러 흐름을 동시에 수행한다는 공통점이 있지만, 멀티프로세스는 각 프로세스가 독립적인 메모리를 가지고 별도로 실행된다.
 * 멀리 스레드는 각 스레드가 자신이 속한 프로세스의 메모리를 공유하다는 점이 다르다.
 *
 * -멀티 스레드 장점
 * 1. 스레드가 속한 프로세스의 메모리를 공유하므로 시스템 자원의 낭비가 적다.
 * 2. 하나의 스레드가 작업할 때 다른 스레드가 별도의 작업을 할 수 있어 사용자와의 응답성도 향상된다.
 *
 * -문맥 교환(Context Switching) = CPU의 코어
 * 컴퓨터에서 동시에 처리할 수 있는 최대 작업 수는 CPU의 코어(core)수와 같다.
 * 만약 CPU의 코어 수보다 더 많은 스레드가 실행되면, 각 코어가 정해진 시간 동안 여러 작업을 번갈아가며 수행하게 된다.
 * 문맥교환에 걸리는 시간이 커지면 커질수록, 멀티스레딩의 효율은 저하된다.
 *
 * ※유의점 : 많은 수의 스레드를 실행하는 것이 언제나 좋은 성능을 보이는 것은 아니다.
 *
 *
 * -데몬 스레드(deamon thread)
 * 데몬 스레드란 다른 일반 스레드의 작업을 돕는 보조적인 역할을 하는 스레드를 가리킨다.
 * 따라서 데몬 스레드는 일반 스레드가 모두 종료되면 더는 할 일이 없으므로, 데몬 스레드 역시 자동으로 종료된다.
 *
 * 데몬스레드의 생성방법과 실행 방법은 모두 일반 스레드와 같다.
 * 단, 실행하기 전에 setDaemon() 메소드를 호출하여 데몬 스레드로 설정하기만 하면된다.
 *
 * -가비지 컬렉터(gabage Collector)
 * 데몬 스레드를 이용하는 가장 대표적인 예는 가비지 컬렉터를 들 수 있다. 가비지 컬렉터란 프로그래머가 동적으로 할당한 메모리 중
 * 더 이상 사용하지 않는 영역을 자동으로 찾아내어 해제해 주는 데몬 스레드이다.
 *
 * Java는 프로그래머가 메모리에 직접 접근하지 못하게 하는 대신에 가비지 컬렉터가 자동으로 메모리를 관리해 준다.
 * 이러한 가비지 컬렉터를 이용하면 프로그래밍을 하기가 훨씬 쉬워지고, 메모리에 관련된 버그가 발생할 확률도 낮아진다.
 *
 *
 */

public class Thread02 {
    public static void main(String[] args) {
        Thread thread0 = new Thread(new ThreadWithRunnable());
        thread0.start();  // Thread-0 실행
        System.out.println(thread0.getThreadGroup());

        ThreadGroup group = new ThreadGroup("myThread");// myThread라는 스레드 그룹 생성함.
        group.setMaxPriority(7); // 해당 스레드 그룹의 최대 우선순위를 7로 설정함.

        // 스레드를 생성할 때 포함될 스레드 그룹을 전달할 수 있음.
        Thread thread1 = new Thread(group, new ThreadWithRunnable());
        thread1.start(); // Thread-1 실행
        System.out.println(thread1.getThreadGroup());
    }

    /**
     * 출력결과
     *      java.lang.ThreadGroup[name=main,maxpri=10]
     *      java.lang.ThreadGroup[name=myThread,maxpri=7]
     *
     *  main()메소드에서 생성된 스레드의 기본 스레드 그룹의 이름은 "main"이 되며, 최대 우선순위는 10으로 자동 설정됩니다.
     *
     *
     */
}
