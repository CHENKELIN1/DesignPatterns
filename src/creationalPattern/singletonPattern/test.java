package creationalPattern.singletonPattern;

public class test {
    public static void main(String[] args) {
        SingleObject_eh singleObject_eh=SingleObject_eh.getInstance();
        singleObject_eh.showMessage();

        SingleObject_lh_unsafe singleObject_lh_unsafe = SingleObject_lh_unsafe.getInstance();
        singleObject_lh_unsafe.showMessage();

        SingleObject_lh_safe singleObject_lh_safe=SingleObject_lh_safe.getInstance();
        singleObject_lh_safe.showMessage();

        SingleObject_DCL singleObject_dcl=SingleObject_DCL.getInstance();
        singleObject_dcl.showMessage();
    }
}
