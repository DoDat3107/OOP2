package bai2jame;

public class QuadraticEquation {
    private double a, b, c; // Khai báo a, b, c là private

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b * b - (4 * a * c);
    }

    public double x1() {
        double delta = delta();
        return  (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double x2() {
        double delta = delta();
        return (-b - Math.sqrt(delta)) / (2 * a);

    }

    public double x3() {
        return -b / (2 * a);
    }

    // Các phương thức getter cho a, b, c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
