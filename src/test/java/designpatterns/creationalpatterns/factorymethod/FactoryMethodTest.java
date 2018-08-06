package designpatterns.creationalpatterns.factorymethod;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @org.junit.Test
    public void testFactoryA() {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.factoryMethod();
        assertTrue(product instanceof ConcreteProductA);
    }

    @org.junit.Test
    public void testFactoryB() {
        Factory factory = new ConcreteFactoryB();
        Product product = factory.factoryMethod();
        assertTrue(product instanceof ConcreteProductB);
    }

}
