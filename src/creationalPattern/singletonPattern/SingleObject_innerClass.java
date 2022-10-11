package creationalPattern.singletonPattern;

public class SingleObject_innerClass {
    //    静态内部类实现实例创建
    private static class SingletonHolder {
        private static SingleObject_innerClass instance = new SingleObject_innerClass();
    }

    private SingleObject_innerClass() {

    }

    //    获取唯一可用实例
    public static SingleObject_innerClass getInstance() {
        return SingletonHolder.instance;
    }

    public void showMessage() {
        System.out.println("静态内部类单例");
    }
}
