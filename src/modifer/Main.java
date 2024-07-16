package modifer;

public class Main {
        public static void main(String[] args) {

            Access_modifier circle1 = new Access_modifier();
            Access_modifier circle2 = new Access_modifier(2.5, "red");


            System.out.println("Radius of circle1: " + circle1.getRadius());
            System.out.println("Area of circle1: " + circle1.getArea());
            System.out.println("Radius of circle2: " + circle2.getRadius());
            System.out.println("Area of circle2: " + circle2.getArea());
        }
    }


