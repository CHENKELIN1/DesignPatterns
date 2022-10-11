package creationalPattern.singletonPattern;

public class SingleObject_DCL {
    private static volatile SingleObject_DCL instance;

    private SingleObject_DCL() {

    }

    public static SingleObject_DCL getInstance() {
        if (instance == null) {
            synchronized (SingleObject_DCL.class) {
                if (instance == null) {
                    instance = new SingleObject_DCL();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("双重锁校验单例");
    }
}
