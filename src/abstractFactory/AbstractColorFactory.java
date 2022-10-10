package abstractFactory;

public class AbstractColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeName) {
        return null;
    }

    public Color getColor(String colorName)
    {
        if (colorName.equalsIgnoreCase("red"))
        {
            return new Red();
        }
        return null;
    }
}
