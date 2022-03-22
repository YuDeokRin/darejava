package com.ch06;

abstract class Ball{
    abstract String getName();
}

class basketBall extends Ball {
    private String name = "농구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class soccerBall extends Ball{
    private String name = "축구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Bag<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericEx04 {
    //9시 경우 축구공을, 12시는 농구공 putIn 한다.
    static Bag<? extends Ball> putIn(int time){
        if(time==9){
            System.out.println("축구공이 담겼다.");
            soccerBall soccerBall = new soccerBall(); // 축구공 만든다.
            Bag<soccerBall> soccerBallBag = new Bag<>(); // 축구공이 들어갈 수 있는 가방을 만든다.
            soccerBallBag.setData(soccerBall);
            return soccerBallBag;
        }else{
            System.out.println("농구공이 담겼다.");
            basketBall basketBall = new basketBall();
            Bag<basketBall> basketBallBag = new Bag<>();
            basketBallBag.setData(basketBall);
            return basketBallBag;
        }

    }

    public static void main(String[] args) {
//        soccerBall soccerBall = new soccerBall();
//        basketBall basketBall = new basketBall();

//        System.out.println(soccerBall.getName());
//        System.out.println(basketBall.getName());

//        Bag<basketBall> basketBallBag = new Bag<>();
        /**
         * class Bag<basketBall>{
         *     private basketBall data;
         *
         *     public basketBall getData() {
         *         return data;
         *     }
         *
         *     public void setData(basketBall data) {
         *         this.data = data;
         *     }
         * }
         *
         * 위에 Bag클래스에서 <t>는 이렇게 <basketBall>이렇게 변한다.
         */


//        basketBallBag.setData(basketBall);
//        System.out.println(basketBallBag.getData().getName());


//        Bag<soccerBall> soccerBallBag = new Bag<>();
//        soccerBallBag.setData(soccerBall);
//        System.out.println(soccerBallBag.getData().getName());


//        putIn(9);
//        putIn(12);

        Bag<? extends Ball> a1 = putIn(9);
        Bag<? extends Ball> a2 = putIn(12);
//        a1는 getData()가 Object 이다.
//        이유는 :  <T> 가 Object의 자식이기 때문에  Object가
//                되어버린다. 그러면 a1.getData().getName;이
//                불가하다.
//
//          와일드카드 유의점 :
//        무슨 공이 있는지 호출하기 어렵다.
//        그렇기 때문에 Object가 아닌 다른 추상클래스를 만들어서 상속받아야된다.
        System.out.println(a1.getData().getName());
    }
}