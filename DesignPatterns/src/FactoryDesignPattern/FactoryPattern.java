package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var factory = new GetShapeFactory();
        System.out.println("Enter a shape (c or R or S)");
        var shapeType = sc.nextLine();
        var shape = factory.getShape(shapeType);
        shape.drawShape();

    }
}
