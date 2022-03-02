package com.ch03;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 100;
        double d1 = n1 ;
        System.out.println("d1 = " + d1);

        double d2 = 100.8;

        int n2 = (int)d2;
        System.out.println("n2 = " + n2);
    }
}
