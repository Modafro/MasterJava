package InterfaceAndAbstract;

public class ReadMe {
    /*Abstract clases:
     ->Abstract classes are similar to interfaces. You can't instantiate them, and they can contain a mix of methods declared
    * with or without an implementation.
      -> you can declare fields that are not static and final and define public, protected, and private concrete methods (i.e.
      with actual implementations)
      -> abstract class can only extend one parent class but can implement multiple interfaces
      -> when abstract class is subclassed, the subclass usually provides implementations for all abstract methods in its parent class.
         If it does not, then the subclass must also be declared abstract (check the Bird and Animal example vs Pinguin and Bird example)
      Use abstract class when:
       -> share code among several closely related classes
       -> expect classes that extend your abstract class to have many common methods or fields or required access modifiers other than public (protected, private)
       -> you want to declare non static or non final fields, this allows you to define methods that can access and modify the state of an object

      Summary: Purpose of abstract class is to provide a common definition of a base class that multiple derived classes can share
     */

    /*Interface classes
    -> just a declaration of methods of a class, no implementations
    -> it's where we define the kind of operation an object can perform. Operations are defined by the classes that implement the Interface
    -> interfaces form a contract between the class and outside world, this contract is enforced at build time by the compiler
    -> you can't instantiate them, they may contain methods declared without an implementation and also with implementation(?). all methods are automatically
    public and abstract
    -> an interface can extend another interface
    -> interfaces are more flexible
    Use interface when:
    -> expect unrelated classes will implement your interface
    -> want to separate different behaviors
    -> specify a behavior of a particular data type but you're not concerned about who implements its behavior

    */
}
