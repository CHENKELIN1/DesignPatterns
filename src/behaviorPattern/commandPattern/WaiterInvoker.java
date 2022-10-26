package behaviorPattern.commandPattern;

import java.util.LinkedList;
import java.util.List;

public class WaiterInvoker {
    private List<FoodCommand> orders = new LinkedList<>();
    private List<FoodCommand> cancleOrders = new LinkedList<>();

    public void addOrder(FoodCommand order) {
        orders.add(order);
        System.out.println("add order:\t" + order.foodName);
    }

    public void deletOrder(FoodCommand order) {
        if (orders.remove(order)) {
            cancleOrders.add(order);
            System.out.println("delete order:\t" + order.foodName);
        } else {
            System.out.println("sorry no such order");
        }
    }

    public void notifyCook(){
        for (FoodCommand foodCommand:orders){
            foodCommand.executeCommand();
        }
    }

    public void notifyNoCook(){
        for (FoodCommand foodCommand:cancleOrders){
            foodCommand.cancleCommand();
        }
    }
}
