package creationalPattern.abstractFactory;

public class AbstractShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeName)
    {
        if (shapeName.equalsIgnoreCase("square"))
        {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }
}
