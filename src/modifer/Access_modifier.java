package modifer;

public class Access_modifier {
    private double radius = 1.0;
    private String color = "red";

    public Access_modifier() {
    }

    public Access_modifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;

    }
    public void getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}


