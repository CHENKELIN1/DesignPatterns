package creationalPattern.builder;

public class BurgerA extends Burger {
    @Override
    public String name() {
        return "BurgerA";
    }

    @Override
    public float price() {
        return 23.5f;
    }
}
