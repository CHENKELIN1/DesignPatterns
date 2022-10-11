package creationalPattern.singletonPattern;

//饿汉式单例
public class SingleObject_eh {
    //    创建实例
    private static SingleObject_eh instance = new SingleObject_eh();

    //    构造函数私有化，则该类不会在外部被实例化
    private SingleObject_eh() {

    }

    //    获取唯一可用实例
    public static SingleObject_eh getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("饿汉式单例");
    }
}
