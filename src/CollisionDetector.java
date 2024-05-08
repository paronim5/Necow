import java.awt.Rectangle;

public class CollisionDetector {

    public static boolean checkCollision(Ball ball, Paddle paddle) {
        Rectangle ballRect = ball.hitBox();
        Rectangle paddleRect = paddle.hitBox();
        return ballRect.intersects(paddleRect);
    }

    public static boolean checkCollision(Ball ball, Block block) {
        Rectangle ballRect = ball.hitBox();
        Rectangle blockRect = block.hitBox();
        return ballRect.intersects(blockRect);
    }

    public static boolean checkCollisionWithWalls(Ball ball, int screenWidth, int screenHeight) {
        Rectangle ballRect = ball.hitBox();
        // check collision with right and left wall
        if (ballRect.intersectsLine(0, 0, 0, screenHeight) || ballRect.intersectsLine(screenWidth, 0, screenWidth, screenHeight)) {
            return true;
        }
        // check collision with top wall
        if (ballRect.intersectsLine(0, 0, screenWidth, 0)) {
            return true;
        }
        // check collision with bottom
        if (ballRect.intersectsLine(0, screenHeight, screenWidth, screenHeight)) {
            return true;
        }
        return false;
    }


}