package creationalPattern.abstractFactory;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
