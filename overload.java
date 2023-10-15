import java.util.Scanner;

class AreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of a circle
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth; // Area of a rectangle
    }

    public double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height; // Area of a triangle
        } else {
            return 0.0; // Invalid shape
        }
    }
}

public class overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose a shape to calculate area (circle, rectangle, triangle):");
        String shape = scanner.nextLine();

        if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = calculator.calculateArea(radius);
            System.out.println("Area of the circle: " + area);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();
            double area = calculator.calculateArea(length, breadth);
            System.out.println("Area of the rectangle: " + area);
        } else if (shape.equalsIgnoreCase("triangle")) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double area = calculator.calculateArea(base, height, shape);
            System.out.println("Area of the triangle: " + area);
        } else {
            System.out.println("Invalid shape choice.");
        }

        scanner.close();
    }
}

