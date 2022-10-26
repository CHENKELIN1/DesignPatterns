package behaviorPattern.commandPattern;

public class Chef1 extends ChefReceiver{
    public Chef1(String chefName) {
        super(chefName);
    }

    @Override
    public void cooking(String foodName) {
        System.out.println(chefName+"cook\t:"+foodName);
    }

    @Override
    public void notCooking(String foodName) {
        System.out.println(chefName+"noCook\t:"+foodName);
    }
}
