package com.ch07;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in (키보드)
        InputStreamReader ir = new InputStreamReader(in); // 65 -> 'A'로 부호화 시켜준다.
        try {
            // -문제점
            // A -> 99개 낭비
            // A ~ 문자 500 -> 500개 낭비
            char[] data = new char[4];
            ir.read(data);
            System.out.println(data);
        } catch (Exception e) { // IOException -> Exception(부모클래스로 대체가능)
            e.printStackTrace();
        }
    }
}
