 class MyClass {

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

        //The Factory

 /* Factory (MyFactory) is taking care of object creation and wiring
 * Tomorrow if A starts depending on something else called D, only A and the factory would be impacted,
 * not the entire object graph  */

        class MyFactory {
            public MyClass createMyClass() {
                return new MyClass(new AImpl());
            }
        }
/*the main method first instantiates the factory, the factory in turn instantiates the object graph,
 each Object declares their dependencies and finally the main method itself sets the ball
 rolling - launch the application by invoking doSomething() of MyClass, ie. the objects starts talking
 to each other executing the usual business.*/
       class Main {
           public static void main(String[] args) {

               MyClass mc = new MyFactory().createMyClass();
               mc.doSome();
           }
       }





