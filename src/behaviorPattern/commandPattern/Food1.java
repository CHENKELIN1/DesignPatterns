package behaviorPattern.commandPattern;

public class Food1 extends FoodCommand{
    public Food1(ChefReceiver chef, String foodName) {
        super(chef, foodName);
    }

    @Override
    public void executeCommand() {
        chef.cooking(foodName);
    }

    @Override
    public void cancleCommand() {
        chef.notCooking(foodName);
    }
}
