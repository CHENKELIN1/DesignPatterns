package creationalPattern.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory)
    {
        if (factory.equalsIgnoreCase("shape"))
        {
            return new AbstractShapeFactory();
        }else if (factory.equalsIgnoreCase("color"))
        {
            return new AbstractColorFactory();
        }
        return null;
    }
}