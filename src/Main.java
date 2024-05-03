import ManualDependencyInjection.MyClass;
import ManualDependencyInjection.MyFactory;

public class Main {
    public static void main(String[] args) {

        MyClass mc = new MyFactory().createMyClass();
        mc.doSome();
    }
}
