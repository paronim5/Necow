import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int diameter;
    private int speedX;
    private int speedY;

    public Ball(int x, int y, int diameter, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speedX = speedX;
        this.speedY = speedY;
    }
//region getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }
    //endregion
    public void move(){
        x += speedX;
        y += speedY;
    }
    public void reverseX(){
        speedX = -speedX;
    }
    public void reverseY(){
        speedY = -speedY;
    }
public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,diameter,diameter);
}
public Rectangle hitBox(){
        return new Rectangle(x,y,diameter,diameter);
}
public boolean intersects(Block block) {
        // Метод для проверки пересечения мяча с блоком
        return hitBox().intersects(block.hitBox());
    }

    public boolean intersects(Paddle paddle) {
        // Метод для проверки пересечения мяча с платформой
        return hitBox().intersects(paddle.hitBox());
    }

}
