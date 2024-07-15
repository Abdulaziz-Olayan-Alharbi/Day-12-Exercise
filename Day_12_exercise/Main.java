package Day_12_exercise;

public class Main {
    public static void main(String[] args){

        Shape shape_1 = new Shape("Green",false);
        shape_1.setColor("Pink");
        System.out.println("color : "+shape_1.getColor());
        shape_1.setFilled(true);
        System.out.println("is it filled : "+shape_1.isFilled());
        System.out.println(shape_1.toString());
        System.out.println("**********************************");

        Circle circle_1 = new Circle("Red" , true, 3.70);
        System.out.println(circle_1.toString());
        System.out.println("Area = " + circle_1.getArea());
        System.out.println("Perimeter = " + circle_1.getPerimeter());
        System.out.println("**********************************");

        Rectangle rectangle_1 = new Rectangle("Black",false,2.60, 1.78);
        System.out.println(rectangle_1.toString());
        System.out.println("Area = " + rectangle_1.getArea());
        System.out.println("Perimeter = " + rectangle_1.getPerimeter());
        System.out.println("**********************************");

        Square square_1 =new Square("Blue",true,2.40);
        System.out.println(square_1.toString());
        System.out.println("Area = " + square_1.getArea());
        System.out.println("Perimeter = " + square_1.getPerimeter());



    }
}
