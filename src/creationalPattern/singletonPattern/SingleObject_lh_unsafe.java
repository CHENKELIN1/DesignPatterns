package creationalPattern.singletonPattern;

//懒汉式单例（不安全）
public class SingleObject_lh_unsafe {
    private static SingleObject_lh_unsafe instance;

    private SingleObject_lh_unsafe() {

    }

    public static SingleObject_lh_unsafe getInstance() {
        if (instance == null) {
            instance = new SingleObject_lh_unsafe();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("懒汉式不安全单例");
    }
}
