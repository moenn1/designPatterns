package AbstractFactory;

import java.util.Scanner;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape createShape(ShapeType type) {
        return null;
    }

    @Override
    public Color createColor(ColorType type) {
        if (type.equals(ColorType.Blue))
            return new Blue();
        else if(type.equals(ColorType.Rouge))
            return new Red();
        else if(type.equals(ColorType.Blue))
            return new Blue();
        else return null;
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        AbstractFactory objet;
        System.out.print("Voulez-vous utiliser des formes (1) ou des couleur (2) :");
        String choix = reader.next();
        if (choix.equals("1"))
        {
            objet= new ShapeFactory();
            objet.createShape(ShapeType.Cercle).afficherShape();
        }
        else
        {
            objet= new ColorFactory();
            objet.createColor(ColorType.Blue).afficherColor();
        }
    }

}
