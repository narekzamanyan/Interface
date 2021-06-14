public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius ) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

public int t=7;
    private int u=9;

    @Override
    public String toString() {
        return  center +
                ",radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
