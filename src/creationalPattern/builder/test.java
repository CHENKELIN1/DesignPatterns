package creationalPattern.builder;

public class test {
    public static void main(String[] args) {
//        创建创造者对象
        MealBuilder mealBuilder = new MealBuilder();
//        创建套餐A
        Meal mealA = mealBuilder.mealA();
        System.out.println("MealA");
        mealA.showItems();
        mealA.getCost();

//        创建自定义套餐
        Meal customizeMeal = mealBuilder.customizeMeal();
        System.out.println("CustomizeMeal");
        customizeMeal.showItems();
        customizeMeal.getCost();
    }
}
