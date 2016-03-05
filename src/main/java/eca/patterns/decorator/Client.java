package eca.patterns.decorator;

/**
 * The client of decorator.
 */
public class Client {

    private final Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void operation() {
        component.doOperation();
    }

}
