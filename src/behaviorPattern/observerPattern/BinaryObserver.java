package behaviorPattern.observerPattern;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject=subject;
    }
    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(subject.getState()));
    }
}
