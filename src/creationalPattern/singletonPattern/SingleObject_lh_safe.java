package creationalPattern.singletonPattern;

public class SingleObject_lh_safe {
    private static SingleObject_lh_safe instance;

    private SingleObject_lh_safe() {

    }

    //    synchronized实现代码同步
    public static synchronized SingleObject_lh_safe getInstance() {
        if (instance == null) {
            instance = new SingleObject_lh_safe();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("懒汉式安全单例");
    }
}
