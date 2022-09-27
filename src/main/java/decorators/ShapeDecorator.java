package decorators;

import interfaces.Shape;

public abstract class ShapeDecorator implements Shape {
    /*
     * instanciation d'un attribut de type shape, permet de différencier
     * l'objet crée en fonction de sa forme
     */
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
/*
*redéfinition de la méthode draw() en fonction de la forme "shape"
* rentrée en argument à la méthode
 */
    public void draw() {
        shape.draw();
    }
}
