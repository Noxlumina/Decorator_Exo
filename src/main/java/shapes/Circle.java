package shapes;

import interfaces.Shape;

public class Circle implements Shape {
    /*
    *classe cercle redéfinissant la méthode draw() de l'interface shape
     */
    @Override
    public void draw() {
        System.out.println("Je suis un cercle");
    }
}
