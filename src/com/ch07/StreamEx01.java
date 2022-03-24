package com.ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in (키보드)

        /**
         * 1. 키보드는 A를 인코딩해서 1000001(2진수)으로 컴퓨터에게 전송한다.
         * 2. ByteStream으로 흘러 들어간다. (Input)
         * ※유의사항 : ByteStream은 한번에 1Byte(8bit)씩만 전송가능하기 더 많이 받지를 못한다.
         * 3. read() 메서드로 1000001 -> 65로 디코딩한다.
         * 4. 65 -> 문자로 부호화시킨다.
         */
        try {
            int data = in.read();
            System.out.println(data);
            System.out.println((char) data); // 부호화 시킨다.
        } catch (Exception e) { // IOException -> Exception
            e.printStackTrace();
        }
    }
}
