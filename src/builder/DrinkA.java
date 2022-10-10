package builder;

public class DrinkA extends Drink{
    @Override
    public String name() {
        return "DrinkA";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
