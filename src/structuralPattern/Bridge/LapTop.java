package structuralPattern.Bridge;

public class LapTop extends Computer{
    public LapTop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale(){
        super.sale();
        System.out.println("sale LapTop");
    }
}
