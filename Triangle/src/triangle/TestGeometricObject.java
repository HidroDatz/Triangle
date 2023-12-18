/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;

/**
 *
 * @author ASUS
 */
public class TestGeometricObject {

    
    public static void main(String[] args) {
         // Test the default constructor
        Triangle defaultTriangle = new Triangle();
        System.out.println("Default Triangle:\n" + defaultTriangle.toString());
        System.out.println();

        // Test the constructor with sides
        Triangle sidesTriangle = new Triangle(3, 4, 5);
        System.out.println("Triangle with Sides:\n" + sidesTriangle.toString());
        System.out.println();

        // Test the constructor with sides, color, and filled status
        Triangle fullTriangle = new Triangle(3, 4, 5, "blue", true);
        System.out.println("Full Triangle:\n" + fullTriangle.toString());
    }
    
}
