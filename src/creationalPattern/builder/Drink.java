package creationalPattern.builder;

public abstract class Drink implements Item {
    @Override
    public abstract String name();

    @Override
    public abstract float price();
}
