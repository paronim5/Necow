import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RectangularShape;
import java.util.List;

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

    public List<Block> getBricks() {
        return List.of(bricks);
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
    private static void createGameField(){
        JFrame frame = new JFrame("Game Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    private static void createGameMenu(){
        JFrame frame = new JFrame("menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setShape(new Rectangle(600,1200));
        JPanel controlPanel  = new JPanel();
        JButton startButton = new JButton();
        JButton exitButton = new JButton();
        JButton LeaderBordButton = new JButton();
frame.setVisible(true);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createGameField();
            }
        });


    }
}
