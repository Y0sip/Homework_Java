package ru.mirea.lab2;
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1,1);
        System.out.println(ball);
        ball.setX(2);
        ball.setY(2);
        ball.setXY(3,3);
        System.out.println(ball);
        ball.move(2,2);
        System.out.println(ball);

    }
}