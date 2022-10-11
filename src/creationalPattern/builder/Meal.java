package creationalPattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    //    商品列表
    private List<Item> items = new ArrayList<>();

    //    增加商品
    public void addItem(Item item) {
        items.add(item);
    }

    //    计算套餐价格
    public float getCost() {
        float cost = 0.0F;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    //    显示套餐信息
    public void showItems() {
        items.forEach(item -> {
            System.out.println("item.name() = " + item.name());
            System.out.println("item.price() = " + item.price());
        });
    }
}
