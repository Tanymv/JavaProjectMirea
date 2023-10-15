package Homework1;

public record Complex(int actual, int imaginary) {

    public Complex minus(Complex z) {
        return new Complex(this.actual - z.actual(), this.imaginary - z.imaginary());
    }

    public Complex plus(Complex z) {
        return new Complex(this.actual + z.actual(), this.imaginary + z.imaginary());
    }

    @Override
    public String toString() {
        return String.format("%di + %d", actual, imaginary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Complex other = (Complex) obj;
        return Double.compare(other.actual, actual) == 0 && Double.compare(other.imaginary, imaginary) == 0;
    }
}


class ComplexTest {
    public static void main(String[] args) {
        Complex z = new Complex(3,4);
        System.out.println("Комплексное число z: " + z);
        z = z.plus(new Complex(3, 2));
        System.out.println("Комплексное число z: " + z);
        z = z.minus(new Complex(2,1));
        System.out.println("Комплексное число z: " + z);
        Complex z1 = new Complex(4,5);
        System.out.println("Комплексное число z1: " + z1);
        System.out.println(z.equals(z1) ? "z == z1":"z != z1");
    }
}
