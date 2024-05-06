public class BallAndPlatform {
    private int x;
    private int y;
    private int diameter;
    private int speedX;
    private int speedY;

    public BallAndPlatform(int x, int y, int diameter, int speedX, int speedY) {
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

}
