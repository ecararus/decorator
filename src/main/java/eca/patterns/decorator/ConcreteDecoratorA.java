package eca.patterns.decorator;

/**
 * Concrete Decorators extend the functionality of the component by adding state or adding behavior.
 */
public class ConcreteDecoratorA extends Decorator {

    private Object someAdditionalMagic;

    public ConcreteDecoratorA(Component component) {
        super(component);
        this.someAdditionalMagic = "some additional magic";
    }

    @Override
    public void doOperation() {
        super.doOperation();
        additionalOperation();
    }

    private void additionalOperation() {
        System.out.println("Now is time to add " + someAdditionalMagic);
    }
}
