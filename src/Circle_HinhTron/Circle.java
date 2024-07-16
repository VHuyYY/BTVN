package Circle_HinhTron;

public class Circle {

    // Static constants and variables
    private static final double PI = 3.14;
    private static int idCounter = 0;
    private static int totalCircles = 0;
    private static double maxRadius = 0;
    private static double totalArea = 0;

    // Instance variables
    private int id;
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.id = ++idCounter;
        this.radius = radius;
        totalCircles++;
        totalArea += calculateArea();

        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    // Calculate area
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Calculate circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Static methods
    public static int getTotalCircles() {
        return totalCircles;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    // Display information
    public void displayInfo() {
        System.out.println("Circle ID: " + id);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}


