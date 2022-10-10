package builder;

public class BurgerB extends Burger {
    @Override
    public String name() {
        return "BurgerB";
    }

    @Override
    public float price() {
        return 13.5f;
    }
}
