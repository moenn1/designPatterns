package AbstractFactory;

public class ShapeFactory extends AbstractFactory{

    public Shape createShape(ShapeType type){
        if (type.equals(ShapeType.Cercle))
            return new Cercle();
        else if (type.equals(ShapeType.Carre))
            return new Carre();
        else if (type.equals(ShapeType.Rectangle))
            return new Rectangle();
        else
            return null;
    }

    @Override
    public Color createColor(ColorType type) {
        return null;
    }

}
