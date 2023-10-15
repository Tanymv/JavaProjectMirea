package practical7;
import java.util.*;

interface MathCalculable {
    double pi = 3.141592;

    double absComplex(int actual, int imaginary);
    double getSquareCircle(int radius);
    double getLengthCircle(int radius);
}

class MathFunc implements MathCalculable {
    private double power(int number) {
        double result = 1;
        for(int i = 0; i < 2; i++) {
            result *= number;
        }
        return result;
    }

    public double absComplex(int actual, int imaginary) {
        return Math.sqrt(power(actual) + power(imaginary));
    }

    public double getSquareCircle(int radius) {
        return pi*power(radius);
    }

    public double getLengthCircle(int radius) {
        return 2*pi*radius;
    }
}

class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        Scanner src = new Scanner(System.in);
        System.out.println("Введите следующие параметры:");
        System.out.print("radius = "); int radius = src.nextInt();
        System.out.print("Комплексные части числа:" +
                "\nactual = "); int actual = src.nextInt();
        System.out.print("imaginary = "); int imaginary = src.nextInt();
        System.out.println("\nМодуль комлексного числа: " + mc1.absComplex(actual, imaginary));
        System.out.println("Площадь круга: " + mc1.getSquareCircle(radius));
        System.out.println("Окружность круга: " + mc1.getLengthCircle(radius));
    }
}
