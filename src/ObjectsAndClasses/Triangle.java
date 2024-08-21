package ObjectsAndClasses;

import java.util.Scanner;

public class Triangle {
    float side1;
    float side2;
    float side3;

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    // Method to calculate the area of the triangle
    float calculateArea() {
        float s = (getSide1() + getSide2() + getSide3()) / 2;
        return (float) Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }

    // Method to calculate the perimeter of the triangle
    float calculatePerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of side1, side2, and side3:");
        float side1 = scanner.nextFloat();
        float side2 = scanner.nextFloat();
        float side3 = scanner.nextFloat();

        Triangle triangle = new Triangle();
        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);

        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());

        scanner.close();
    }
}
