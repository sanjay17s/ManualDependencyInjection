package ManualDependencyInjection;

public class MyFactory {

    /* Factory (ManualDependencyInjection.MyFactory) is taking care of object creation and wiring
     * Tomorrow if ManualDependencyInjection.A starts depending on something else called D, only ManualDependencyInjection.A and the factory would be impacted,
     * not the entire object graph  */

    public MyClass createMyClass() {
        return new MyClass(new AImpl());
    }
}

