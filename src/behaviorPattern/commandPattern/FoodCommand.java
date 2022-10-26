package behaviorPattern.commandPattern;

public abstract class FoodCommand {
    public ChefReceiver chef;
    public String foodName;

    public FoodCommand(ChefReceiver chef, String foodName) {
        this.chef = chef;
        this.foodName = foodName;
    }

    abstract public void executeCommand();

    abstract public void cancleCommand();
}
