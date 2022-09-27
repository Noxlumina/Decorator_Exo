import decorators.RedShapeDecorator;
import interfaces.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape redCircle
                = new RedShapeDecorator(new Circle());
        Shape redRectangle
                = new RedShapeDecorator(new Rectangle());
        System.out.println("Cercle sans bordure");
        circle.draw();
        System.out.println("\nRectangle sans bordure");
        rectangle.draw();
        System.out.println("\nCercle de bordure rouge");
        redCircle.draw();
        System.out.println("\nRectangle de bordure rouge");
        redRectangle.draw();
    }
}
