package creationalPattern.builder;

public class DrinkB extends Drink {
    @Override
    public String name() {
        return "DrinkB";
    }

    @Override
    public float price() {
        return 19.5f;
    }
}
