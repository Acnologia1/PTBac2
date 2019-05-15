package Lession3;

import java.util.Scanner;

public class QuadraticEquation {
    //Phương trình có dạng ax2+bx+c = 0
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public QuadraticEquation() {

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.a;
    }
    public double getC() {
        return this.c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double a) {
        this.b = b;
    }
    public void setC(double a) {
        this.c = c;
    }
    //Trả về giá trị delta
    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }
    //Trả về nghiệm
    public double getRoot1() {
        double r1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
        return r1;
    }
    public double getRoot2() {
        double r2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
        return r2;
    }
    public double getRoot() {
        double x = -(this.b / (2 * this.a));
        return x;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a =");
        double a = scanner.nextDouble();
        System.out.println("Nhập b =");
        double b = scanner.nextDouble();
        System.out.println("Nhập c =");
        double c = scanner.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        double delta = quad.getDiscriminant();
        double nghiem1 = quad.getRoot1();
        double nghiem2 = quad.getRoot2();
        double nghiemkep = quad.getRoot();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm là: x1=" + nghiem1 + ", x2=" + nghiem2);
        } else if (delta == 0) {
            System.out.println("Phương trình có 2 nghiệm =" + nghiemkep);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
