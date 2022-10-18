package structuralPattern.Bridge;

public class Computer {
    private Brand brand;
    public Computer(Brand brand){
        this.brand=brand;
    }
    public void sale(){
        this.brand.sale();
    }
}
