package practical6;

public interface Movable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

}

class MovablePoint implements Movable{

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {

        this.x = x;

        this.y = y;

        this.xSpeed = xSpeed;

        this.ySpeed = ySpeed;

    }

    public void moveUp() {

        System.out.println("Движение вверх");

    }

    public void moveDown() {

        System.out.println("Движение вниз");

    }

    public void moveLeft() {

        System.out.println("Движение влево");

    }

    public void moveRight() {

        System.out.println("Движение вправо");

    }

    @Override

    public String toString() {

        return "MovablePoint{" +

                "x=" + x +

                ", y=" + y +

                ", xSpeed=" + xSpeed +

                ", ySpeed=" + ySpeed +

                '}';

    }

}

class MovableCircle implements Movable{

    private final int radius;

    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        this.radius = radius;

        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

    }

    public void moveUp() {

        System.out.println("Движение круга вверх");

    }

    public void moveDown() {

        System.out.println("Движение круга вниз");

    }

    public void moveLeft() {

        System.out.println("Движение круга влево");

    }

    public void moveRight() {

        System.out.println("Движение круга вправо");

    }

    @Override

    public String toString() {

        return "MovableCircle{" +

                "radius=" + radius +

                ", center=" + center +

                '}';

    }

}

class MovableRectagle implements Movable {

    private final MovablePoint topleft;
    private final MovablePoint bottomRight;

    public MovableRectagle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {

        this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);

        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }

    public void moveUp() {

        System.out.println("Движение прямоугольник вверх");

    }

    public void moveDown() {

        System.out.println("Движение прямоугольник вниз");

    }

    public void moveLeft() {

        System.out.println("Движение прямоугольник влево");

    }

    public void moveRight() {

        System.out.println("Движение прямоугольник вправо");

    }

    @Override

    public String toString() {

        return "MovableRectagle{" +

                "topleft=" + topleft +

                ", bottomRight=" + bottomRight +

                '}';

    }

}

class Main{

    public static void main(String[] args) {

        Movable obj = new MovableCircle(10,20,5,10,10);

        obj.moveDown();

        obj.moveLeft();

        obj.moveRight();

        obj.moveUp();

        System.out.println(obj.toString() + '\n');

        obj.moveDown();

        obj.moveLeft();

        obj.moveRight();

        obj.moveUp();

        System.out.println(obj);

    }

}
