package creationalPattern.factory;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = null;
        while (in.hasNext()) {
            String fruitName = in.nextLine();
            if (fruitName.equals("end")) break;
            fruit = fruitFactory.getFruit(fruitName);
            fruit.buy();
        }
    }
}
