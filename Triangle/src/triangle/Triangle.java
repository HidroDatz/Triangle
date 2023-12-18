/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author ASUS
 */
public class Triangle extends GeometricObject {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super(null, false);
    }

    public Triangle(double sideA, double sideB, double sideC) {
        super(null, false);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTriangle - Side A: " + sideA
                + ", Side B: " + sideB
                + ", Side C: " + sideC
                + "\nArea: " + getArea()
                + ", Perimeter: " + getPerimeter();
    }
}
