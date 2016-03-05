package eca.patterns.decorator;

/**
 * Maintains a reference to a Component object and defines an interface that conforms to Component's interface.
 */
public class Decorator implements Component{

    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void doOperation() {
        component.doOperation();
    }
}
