package behaviorPattern.observerPattern;

public abstract class Observer {
    public Subject subject;
    abstract public void update();
}
