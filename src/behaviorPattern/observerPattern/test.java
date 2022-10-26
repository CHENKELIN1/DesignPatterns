package behaviorPattern.observerPattern;

public class test {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer observer=new BinaryObserver(subject);
        subject.attach(observer);
        subject.setState(10);
    }
}
