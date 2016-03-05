package eca.patterns.decorator;

/**
 * Defines an object to which additional responsibilities can be added.
 */
public class ConcreteComponent implements Component {

    public void doOperation() {
        System.out.println("Do base operation");
    }
}
