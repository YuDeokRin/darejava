package com.ch07;

public class StringEx01 {
    public static void main(String[] args) {
        String s1 = new String("바다");
        String s2 = new String("바다");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println( s1 == s2);  // "==" : 는 주소를 비교한다.
                                                 //출력 결과 = false
                                                 //false인 이유 : s1과 s2는 heap 메모리에서 주소가 다른 곳으로 각자 따로 쓰고 있다.

        String s3 = "바다"; // 해시 코드 :  1538384
        String s4 = "바다"; // 해시 코드 :  1538384
        System.out.println(s3 == s4);  // "==" : 는 주소를 비교한다.
        System.out.println("해시코드 조회 :" + s3.hashCode());
        System.out.println("해시코드 조회 :" + s4.hashCode());

        s3 = s3 + "태양";
        System.out.println(s3); //출력 결과 : 바다태양
        System.out.println(s4); //출력 결과 : 바다
        s3 = s3 + "달";
        System.out.println(s3); //출력 결과 : 바다태양달

        //문자열을 비교할 때 ->s1, s2, s3,s4 (바다)
        System.out.println(s1.equals("바다")); // 문자열 값자체와 주소 두개를 비교
        System.out.println(s2.equals("바다")); // 문자열 값자체와 주소 두개를 비교
        System.out.println(s3.equals("바다")); // 문자열 값자체와 주소 두개를 비교
        System.out.println(s4.equals("바다")); // 문자열 값자체와 주소 두개를 비교

    }
}
