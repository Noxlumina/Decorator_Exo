package decorators;

import interfaces.Shape;

public abstract class ShapeDecorator implements Shape {
    /*
     * instanciation d'un attribut de type shape, permet de différencier
     * l'objet crée en fonction de sa forme
     */
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
/*
*redéfinition de la méthode draw() en fonction de la forme "shape"
* rentrée en argument à la méthode
 */
    public void draw() {
        decoratedShape.draw();
    }
}
