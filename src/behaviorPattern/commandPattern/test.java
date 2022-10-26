package behaviorPattern.commandPattern;

public class test {
    public static void main(String[] args) {
        ChefReceiver chef=new Chef1("jack");
        FoodCommand foodCommand=new Food1(chef,"bread");
        WaiterInvoker waiterInvoker=new WaiterInvoker();
        waiterInvoker.addOrder(foodCommand);
        waiterInvoker.notifyCook();
        waiterInvoker.deletOrder(foodCommand);
        waiterInvoker.notifyNoCook();
    }
}
