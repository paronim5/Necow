import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame {
    private final int WIDTH = 1200;
    private final int HEIGHT = 1200;
    private Ball ball;
    private Paddle paddle;
    private Block[] bricks;

    public GamePanel(Ball ball, Paddle paddle, Block[] bricks) {
        this.ball = ball;
        this.paddle = paddle;
        this.bricks = bricks;
        setBackground(Color.BLACK);
    }
    private void drawGameObjects(Graphics2D g2) {
        ball.draw(g2);
        paddle.draw(g2);
        for (Block brick : bricks) {
            brick.draw(g2);
        }
    }
}
