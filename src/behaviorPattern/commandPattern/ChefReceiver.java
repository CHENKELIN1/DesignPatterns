package behaviorPattern.commandPattern;

public abstract class ChefReceiver {
    public String chefName;

    public ChefReceiver(String chefName) {
        this.chefName = chefName;
    }

    abstract public void cooking(String foodName);
    abstract public void notCooking(String foodName);
}
