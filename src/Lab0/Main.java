package Lab0;
import Lab0.Shapes.*;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Shape triangle = new Triangle(3, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
