package creationalPattern.abstractFactory;

public class test {
    public static void main(String[] args) {
        AbstractFactory factory=null;
        factory=FactoryProducer.getFactory("shape");
        Shape shape=factory.getShape("square");
        shape.draw();

        factory=FactoryProducer.getFactory("color");
        Color color=factory.getColor("red");
        color.fill();
    }
}
