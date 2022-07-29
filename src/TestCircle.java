import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(15.5);
        System.out.println("radius circle1 : "+circle1.getRadius());
        System.out.println("Area circle1 : "+ circle1.getArea());
        System.out.println("radius circle2 : "+circle2.getRadius());
        System.out.println("Area circle2 : " + circle2.getArea());
        System.out.println("color2 :"+ circle2.getColor());
    }
}
