import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 1200;
    private Ball ball;
    private Paddle paddle;
    private Block[] bricks;

    public GamePanel(Ball ball, Paddle paddle, Block[] bricks) {
        this.ball = ball;
        this.paddle = paddle;
        this.bricks = bricks;
        setBackground(Color.BLACK);
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    public Block[] getBricks() {
        return bricks;
    }

    public void setBricks(Block[] bricks) {
        this.bricks = bricks;
    }

    private void drawGameObjects(Graphics2D g2) {
        ball.draw(g2);
        paddle.draw(g2);
        for (Block brick : bricks) {
            brick.draw(g2);
        }
    }
}
