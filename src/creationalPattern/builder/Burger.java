package creationalPattern.builder;

public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public abstract float price();
}
