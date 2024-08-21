package ObjectsAndClasses;
//    Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//    First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method
//    named as 'getArea'


import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    int getArea() {
        return length * breadth;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area area= new Area();
        System.out.println("Enter the length of the rectangle:");
        int length= scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth= scanner.nextInt();

        area.setDim(length,breadth);

        System.out.println("the area of the rectangle is :" +area.getArea());

    }
}
