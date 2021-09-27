package by.bsuir.poit.wt.first.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static final String BLUE_COLOR = "blue";
    private final List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }

    public double ballsWeight() {
        return this.balls.isEmpty() ? -1 : this.balls.stream().map(Ball::getWeight).reduce(Double::sum).get();
    }

    public long blueBallsAmount() {
        return this.balls.stream().filter(b -> b.getColor().equals(BLUE_COLOR)).count();
    }
}
