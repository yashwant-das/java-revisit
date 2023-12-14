class Outer {
    static abstract class AbstractInner {
        abstract void abstractMethod();

        void concreteMethod() {
            System.out.println("Concrete method in AbstractInner class");
        }
    }
}

class ConcreteSubclass extends Outer.AbstractInner {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implementation in ConcreteSubclass");
    }
}

public class AbstractInnerClassExample {
    public static void main(String[] args) {
        ConcreteSubclass subclass = new ConcreteSubclass();
        subclass.abstractMethod();
        subclass.concreteMethod();
    }
}
