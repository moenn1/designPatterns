package AbstractFactory;

public abstract class AbstractFactory {
    public abstract Shape createShape(ShapeType type);
    public abstract Color createColor(ColorType type);
}
