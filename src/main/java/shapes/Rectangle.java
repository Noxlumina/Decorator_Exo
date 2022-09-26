package shapes;

import interfaces.Shape;

public class Rectangle implements Shape {
    /*
     *classe rectangle redéfinissant la méthode draw() de l'interface shape
     */
    @Override
    public void draw() {
        System.out.println("Je suis un rectangle");
    }
}
