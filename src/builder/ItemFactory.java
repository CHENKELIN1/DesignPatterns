package builder;

public class ItemFactory {
    public Item getItem(String name) {
        if (name.equalsIgnoreCase("b1")) {
            return new BurgerA();
        } else if (name.equalsIgnoreCase("b2")) {
            return new BurgerB();
        } else if (name.equalsIgnoreCase("d1")) {
            return new DrinkA();
        } else if (name.equalsIgnoreCase("d2")) {
            return new DrinkB();
        }
        return null;
    }
}
