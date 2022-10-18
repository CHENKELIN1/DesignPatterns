package structuralPattern.DecoratorPattern;

public class LineShapeDecorator extends ShapeDecorator {
    private String line;

    public LineShapeDecorator(Shape shape, String line) {
        super(shape);
        this.line = line;
    }

    @Override
    public void draw() {
        shape.draw();
        setLine();
    }

    private void setLine() {
        System.out.println("line is " + line);
    }
}
