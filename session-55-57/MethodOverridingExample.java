// Base class
class Shape {
    // Method to calculate the area (to be overridden by subclasses)
    double calculateArea() {
        System.out.println("Calculating area of the shape (base class method)");
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    // Radius of the circle
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for circles
    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Calculating area of the circle");
        return area;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    // Dimensions of the rectangle
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method for rectangles
    @Override
    double calculateArea() {
        double area = length * width;
        System.out.println("Calculating area of the rectangle");
        return area;
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Using overridden methods to calculate areas
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        // Displaying the calculated areas
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
