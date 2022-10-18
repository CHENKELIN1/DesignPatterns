package structuralPattern.DecoratorPattern;

public class ColorShapeDecorator extends ShapeDecorator {
    private String color;

    public ColorShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        setColor();
    }

    private void setColor() {
        System.out.println("color is " + color);
    }
}
