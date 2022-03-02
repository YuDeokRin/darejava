package com.ch03;

public class Car {
   public static double Calculator(double gasoline, double distance){
       System.out.println(distance/gasoline );
       return (int)(distance/gasoline);
    }

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = Calculator(gasoline, distance);
        System.out.println("연비 : " + efficiency + "km/L");
    }
}
