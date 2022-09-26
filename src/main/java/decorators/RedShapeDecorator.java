package decorators;

import interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    /*
    *redéfinition de la méthode draw pour la classe redshapedecorator
    * avec l'ajout de la bordure colorée
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    /*
    *méthode invoquant la bordure de couleur rouge
     */
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("avec une bordure de couleur rouge");
    }
}
