package creationalPattern.builder;

import java.util.Scanner;

public class MealBuilder {
    public Meal mealA() {
        Meal meal = new Meal();
        meal.addItem(new BurgerA());
        meal.addItem(new DrinkA());
        return meal;
    }

    public Meal customizeMeal() {
        Scanner in = new Scanner(System.in);
        Meal meal = new Meal();
        ItemFactory factory = new ItemFactory();
        System.out.println("请输入商品");
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.equalsIgnoreCase("end")) {
                break;
            }
            meal.addItem(factory.getItem(str));
        }
        return meal;
    }
}