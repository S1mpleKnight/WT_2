package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.entity.Ball;
import by.bsuir.poit.wt.first.entity.Basket;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(3.5, "blue"));
        basket.addBall(new Ball(1.1, "red"));
        basket.addBall(new Ball(2.2, "blue"));
        basket.addBall(new Ball(9.4, "red"));
        basket.addBall(new Ball(7.2, "green"));
        basket.addBall(new Ball(0.5, "blue"));
        basket.addBall(new Ball(5.0, "green"));

        System.out.println(basket.ballsWeight());

        System.out.println(basket.blueBallsAmount());
    }
}
