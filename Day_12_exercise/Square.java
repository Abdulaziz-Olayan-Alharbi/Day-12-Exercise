package Day_12_exercise;

public class Square extends Rectangle {

    private double side = super.getLength();

    public Square() {

    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color , boolean filled , double side) {
        super(color,filled,side,side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Square {side=" + side + "} which is a subclass of " + super.toString();
    }
}
