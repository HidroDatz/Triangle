/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author ASUS
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();

}
