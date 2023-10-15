package practical2;
import java.util.Scanner;
public class Circle {
    double r;
    double x;
    double y;
    String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Circle(double r, double x, double y, String color) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public double getR() {
        return r;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setR(double r) {
        this.r = r;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double Square(){
        return Math.PI*r*r;
    }
    public double size(){
        return Math.PI*2*r;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}

class CircleTest {

    public static void Sravni(Circle N1, Circle N2) {

        if (N1.getR() > N2.getR()){

            System.out.println("Первый круг больше второго");

        }

        else{

            System.out.println("Второй круг больше первого");

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Circle Circle1 = new Circle(3.1,4.1,5.1,"red");

        Circle Circle2 = new Circle(0,0,3,"white");

        Sravni(Circle1,Circle2);

        Circle2.setR(5);

        Sravni(Circle1,Circle2);

    }

}
