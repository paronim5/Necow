import java.util.List;

public class BallMovementStrategy implements MovementStrategy {
    public GamePanel gm;
    @Override
    public void move(Ball ball) {

        if (!ball.isMoving()) {
            ball.setSpeedX(1); // started speed x
            ball.setSpeedY(-1); // started speed y
            ball.setMoving(true);
        }
        //ballmovement
        ball.setX(ball.getX() + ball.getSpeedX());
        ball.setY(ball.getY() + ball.getSpeedY());

        // colision with walls
        if (ball.getX() + ball.getDiameter() >= GamePanel.WIDTH) {
            ball.reverseX(); // reflect from right and left wall
        }
        if (ball.getY() <= 0) {
            ball.reverseY(); // reflect from top
        }

      List<Block> blocks = gm.getBricks(); //we should get block from game panel dont work
        for (Block block : blocks) {
            if (CollisionDetector.checkCollision(ball, block)) {
                // delite block + change ball direction
                blocks.remove(block);
                ball.reverseY();
                break; // breack loop to not check colision
            }
        }

    }

    @Override
    public void moveP(Paddle paddle) {}
}
