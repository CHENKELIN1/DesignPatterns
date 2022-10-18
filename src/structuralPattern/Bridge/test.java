package structuralPattern.Bridge;

public class test {
    public static void main(String[] args) {
        Computer computer=new DeskTop(new Lenovo());
        computer.sale();

        Computer computer1=new LapTop(new Dell());
        computer1.sale();

        Computer computer2=new Server(new Hp());
        computer2.sale();
    }
}
