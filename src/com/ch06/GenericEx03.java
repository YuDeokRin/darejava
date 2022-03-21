package com.ch06;

/**
 *  들어간 개념 : 제네릭, 다형성, 추상클래스, Object, 오버라이드(무효화) , 동적바인딩
 */

abstract class 공{
    abstract String getName();
}

class 농구공 extends 공{
    // private 때문에 상태(농구공, 축구공)에 직접적으로 접근을 못하기 때문에
    // 행위(get,set)을 통해서 접근한다.
    private String name = "농구공";

    // 자식(축구공, 농구공)이 부모(공)의 메서드와 동일한 것을 들고 있으면
    // 부모의 메서드가 오버라이드(무효화) 된다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 축구공 extends 공{

    private String name = "축구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 가방<T> {
    private T data ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericEx03 {

    static 가방<? extends 공> 꺼내기(int time) { // 9시  =  축구, 12 =  농구
        if (time == 9) {
            System.out.println("가방에 축구공이 담겼다.");
            축구공 g2 = new 축구공();
            가방<축구공> b2 = new 가방<>();
            b2.setData(g2);
            return b2;
        } else {
            System.out.println("가방에 농구공이 담겼다.");
            농구공 g1 = new 농구공();
            가방<농구공> b1 = new 가방<>();
            b1.setData(g1);
            return b1;
            // static 가방<축구공> 꺼내기(int time) 일때 else 부분에 return b1은 안된다.
            //return b1; // 안된다.  이유: b2는 가방<축구공> 으로 되어있기 때문에 가능하지만,
            //                           b1는 가방<농구공>으로 되어있기 때문이다. 메소드 타입은 가방<축구공>이기때문이다.
            //                     해결책: static 가방<축구공>에서 축구공 부분에 와일드카드(?)를 사용하면된다.
            //                     참고: 가방<?>는 생략된 단어이다. 생략된걸 다 쓴다면
            //                          가방<? extends Object>  이다.
            //                    변경 전 -> static 가방<축구공> 꺼내기(int time)
            //                    변경 후 ->  static 가방<?> 꺼내기(int time)
            // 와일드 카드 쓸 떄 유의점 :
            //
        }
    }

    public static void main(String[] args) {
        가방<? extends 공> r1 = 꺼내기(9);
        가방<? extends 공> r2 = 꺼내기(12);


        //r1.getData().getName;
        //r1.getData().getName이 안되는 이유 : "공" 이라는 추상클래스가 getName()이라는 메소드를 갖고 있지 않기 때문이다.
        //되게하려면 "공"이라는 클래스에 getName()메소드를 abstract String getName()이라는 메소드를 만들어준다
        // 오바라이드를 사용해서 자식(축구공, 농구공)에 getName()의 메소드를 재정의 해준다.

        System.out.println(r1.getData().getName());
        System.out.println(r2.getData().getName());
    }
}
