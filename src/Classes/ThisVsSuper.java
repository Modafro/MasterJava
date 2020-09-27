package Classes;

public class ThisVsSuper {
    /*
    User super to call a parent class in the case of inheritance ("extends") to access constructor or methods from parent class

    The this() call (and it's a call because of the braces):
    -> use this() to call a constructor from another overloaded constructor in the same class
    -> can only be used in a constructor, and it must be the first statement in a constructor. used for constructor chaining (see Account class example in
    constructor package example) which helps avoid duplicated code

    Ths super() call:
    -> calls the constructor of parent class

    You can't have a this() and super() inside the same constructor
     */
}
