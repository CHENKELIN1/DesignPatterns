package structuralPattern.Bridge;

public class Server extends Computer {
    public Server(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("sale Server");
    }
}
