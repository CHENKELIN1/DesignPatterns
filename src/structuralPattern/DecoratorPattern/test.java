package structuralPattern.DecoratorPattern;

public class test {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();
        System.out.println("--------------------------");
        shape=new ColorShapeDecorator(shape,"red");
        shape.draw();
        System.out.println("--------------------------");
        shape=new LineShapeDecorator(shape,"dotted");
        shape.draw();
        System.out.println("--------------------------");
    }
}
