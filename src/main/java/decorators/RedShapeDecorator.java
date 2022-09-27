package decorators;

import interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    /*
    *redéfinition de la méthode draw pour la classe redshapedecorator
    * avec l'ajout de la bordure colorée
     */
    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
    /*
    *méthode invoquant la bordure de couleur rouge
     */
    private void setRedBorder(Shape shape) {
        System.out.println("avec une bordure de couleur rouge");
    }
}
