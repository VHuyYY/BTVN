package Circle_HinhTron;

public class Main {
    public static void main(String[] args) {
        // Create Circle objects
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(2);

        // Display individual circle information
        circle1.displayInfo();
        circle2.displayInfo();
        circle3.displayInfo();

        // Display total circles created
        System.out.println("Total Circles Created: " + Circle.getTotalCircles());

        // Display the circle with the maximum radius
        System.out.println("Maximum Radius: " + Circle.getMaxRadius());

        // Display the total area of all circles
        System.out.println("Total Area of all Circles: " + Circle.getTotalArea());
    }
}


