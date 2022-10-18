package structuralPattern.Bridge;

public class DeskTop extends Computer{
    public DeskTop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale(){
        super.sale();
        System.out.println("sale deskTop");
    }
}
