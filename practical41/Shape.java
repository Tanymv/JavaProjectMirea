package practical41;

public abstract class Shape {
    protected String color;

    protected boolean filled;

    public Shape(String color, boolean filled) {

        this.color = color;

        this.filled = filled;

    }

    public String getColor() {

        return color;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public boolean isFilled() {

        return filled;

    }

    public void setFilled(boolean filled) {

        this.filled = filled;

    }

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override

    public String toString() {

        return "Shape{" +

                "color='" + color + '\'' +

                ", filled=" + filled +

                '}';

    }

}

class Circle extends Shape{

    protected double radius;

    public Circle(String color, boolean filled, double radius) {

        super(color, filled);

        this.radius = radius;

    }

    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

    public double getPerimeter() {

        return 2 * Math.PI * this.radius;

    }

    @Override

    public String toString() {

        return "Circle{" +

                "radius=" + radius +

                '}';

    }

}

class Rectangle extends Shape {

    protected double width;

    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {

        super(color, filled);

        this.width = width;

        this.length = length;

    }

    public double getWidth() {

        return width;

    }

    public void setWidth(double width) {

        this.width = width;

    }

    public double getLength() {

        return length;

    }

    public void setLength(double length) {

        this.length = length;

    }

    public double getArea() {

        return this.width * this.length;

    }

    public double getPerimeter() {

        return 2 * (this.width * this.length);

    }

    @Override

    public String toString() {

        return "Rectangle{" +

                "color='" + color + '\'' +

                ", filled=" + filled +

                ", width=" + width +

                ", length=" + length +

                '}';

    }

}

class Square extends Rectangle{

    private double side;

    public Square(String color, boolean filled, double width, double length, double side) {

        super(color, filled, width, length);

        this.side = side;

    }

    public double getSide() {

        return side;

    }

    public void setSide(double side) {

        this.side = side;

    }

    public void setWidth(double width) {

        super.setWidth(width);
    }

    public void setLength(double length) {

        super.setLength(length);
    }

    @Override

    public String toString() {

        return "Square{" +

                "color='" + color + '\'' +

                ", filled=" + filled +

                ", width=" + width +

                ", length=" + length +

                ", side=" + side +

                '}';

    }
}
