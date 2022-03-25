package com.ch07;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 *      -Stream(스트림)
 *      자바에서는 파일이나 콘솔의 입출력을 직접 다루지 않고, 스트림(Stream)이라는 흐름을 통해 다룬다.<br>
 * </p>
 *
 * <p>
 *      Stream이란? 실제의 입력이나 출력이 표현된 데이터의 이상화된 흐름을 의미한다.<br>
 *      즉, 스트림은 운영체제에 의해 생성되는 가상의 연결 고리를 의미하며, 중간 매개자 역할을 한다.
 *
 *     ※유의사항  :  Java SE 8 버젼부터 추가된 Stream API와는 다른 개념이다.
 * </p>
 *
 *
 *  아래 표는 코드 참고
 * <p>
 *          | 클래스        | 메소드                                  | 설명                                 |   <br>
 *          | ---         | ---                                    | ---                                 |  <br>
 *          | InputStream | abstract int read()                    | 해당 입력 스트림으로부터 다음바이트를 읽어들임. |<br>
 *          |             | int read( byte[ ] b)                   | 해당 입력 스트림으로부터 특정 바이트를 읽어들인 후 , 배열 b에 저장함 |<br>
 *          |             | int read(byte[ ] b, int off, int len   | 해당 입력 스트림으로부터 len 바이트를 읽어들인 후, 배열 b[off]부터 저장함. |<br>
 *          | OutputStream| abstract void write(int b)             | 해당 출력 스트림에 특정 바이트를 저장함. |<br>
 *          |             | void write(byte[ ] b)                  | 배열 b의 특정 바이트를 배열 b의 길이만큼 해당 출력 스트림에 저장함. |<br>
 *          |             | void write(byte[ ] b, int off, int len | 배열 b[off]부터 len 바이트를 해당 출력 스트림에 저장함. |<br>
 * </p>
 *
 */

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
