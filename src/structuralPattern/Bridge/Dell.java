package structuralPattern.Bridge;

public class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("sale Dell");
    }
}
