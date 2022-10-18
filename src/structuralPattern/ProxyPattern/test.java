package structuralPattern.ProxyPattern;

public class test {
    public static void main(String[] args) {
        Image image=new ProxyImage("text.txt");
        System.out.println("first:");
        image.display();

        System.out.println("second");
        image.display();
    }
}
