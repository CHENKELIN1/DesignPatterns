package creationalPattern.factory;

public class FruitFactory {
    public Fruit getFruit(String fruit)
    {
        if (fruit.equalsIgnoreCase("apple"))
        {
            return new Apple();
        }else if (fruit.equalsIgnoreCase("banana"))
        {
            return new Banana();
        }else if (fruit.equalsIgnoreCase("orange"))
        {
            return new Orange();
        }
        return null;
    }
}
