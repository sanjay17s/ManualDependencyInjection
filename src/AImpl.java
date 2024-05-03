public class AImpl implements A{

    @Override
    public A giveA() {
        return null;
    }
// AImpl is a singleton

    /*If the factory takes care of creating only one instance of a Class (by invoking new() only once), its a Singleton.
     Isn’t it? Then the factory may pass that unique instance in the form of dependencies to all other objects those need it.*/

}
