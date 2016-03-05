package eca.patterns.decorator;

import org.testng.annotations.Test;

public class ClientTest {

    @Test
    public void operation() throws Exception {
        Component component = new ConcreteDecoratorA(new ConcreteComponent());
        Client client = new Client(component);
        client.operation();
    }

}