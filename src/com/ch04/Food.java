
package com.ch04;


public class Food {
    String name;

    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void MyPrint(){
        System.out.println(name + "가격은" +  price +"원  입니다 ");
    }
}

class FoodExam{
    public static void main(String[] args) {
        Food food = new Food("치킨", 2000);
        Food food1= new Food("피자", 5000);

        food.MyPrint();
        food1.MyPrint();
    }

}


