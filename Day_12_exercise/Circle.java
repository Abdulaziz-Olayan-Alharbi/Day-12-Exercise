package Day_12_exercise;

public class Circle extends Shape {

    private double radius;


    public Circle (String color , boolean filled , double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle () {
        this.radius = 1.0;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Circle{"+ "radius=" + radius + "} which is a subclass of " + super.toString() ;
    }


}
