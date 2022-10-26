package behaviorPattern.observerPattern;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observerList= new LinkedList<>();
    private int state;
    public void setState(int state){
        this.state=state;
        System.out.println("now state:"+state);
        notifyAllObserver();
    }
    public int getState(){
        return state;
    }
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void notifyAllObserver(){
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
