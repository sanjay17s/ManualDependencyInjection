package ManualDependencyInjection;

public class MyClass {

    /* here class MyClass depends upon A
    * so in constructor we pass A ,which is an interface  (programing to the interface)
    * Here the constructor asks for the dependencies as parameters, but does not create them  */

         private A a;

         MyClass(A a) {
             this.a = a;
         }

        public void doSome() {
             a.giveA();
         }
     }











