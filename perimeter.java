class Rectangle {
    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        length = 0.0;
        breadth = 0.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two rectangles using default constructor
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // Initialize the rectangles using the parameterized constructor
        rectangle1 = new Rectangle(5.0, 4.0);
        rectangle2 = new Rectangle(3.0, 7.0);

        // Calculate and display the perimeter of the rectangles
        double perimeter1 = rectangle1.calculatePerimeter();
        double perimeter2 = rectangle2.calculatePerimeter();

        System.out.println("Perimeter of Rectangle 1: " + perimeter1);
        System.out.println("Perimeter of Rectangle 2: " + perimeter2);
    }
}

