package com.ch07;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * -버퍼(Buffer)
 * 스트림은 내부에 버퍼(buffer)라는 임시 메모리 공간을 가지고 있습니다.
 * 이러한 버퍼를 이용하면 입력과 출력을 좀 더 효율적으로 처리할 수 있게 됩니다.
 *
 */
public class StreamEx03 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in (키보드)
        InputStreamReader ir = new InputStreamReader(in); // 65 -> 'A'로 부호화 시켜준다.
        BufferedReader br = new BufferedReader(ir);

        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
