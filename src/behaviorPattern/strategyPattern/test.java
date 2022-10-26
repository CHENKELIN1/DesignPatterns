package behaviorPattern.strategyPattern;

public class test {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("add"+context.executeStartegy(1,1));

        Context context1=new Context(new OperationSubstract());
        System.out.println("subtract"+context1.executeStartegy(1,1));
    }
}
