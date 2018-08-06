package designpatterns.creationalpatterns.factorymethod;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FactoryMethodTest {

    @Test
    public void testFactoryA() {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.factoryMethod();
        assertTrue(product instanceof ConcreteProductA);
    }

    @Test
    public void testFactoryB() {
        Factory factory = new ConcreteFactoryB();
        Product product = factory.factoryMethod();
        assertTrue(product instanceof ConcreteProductB);
    }

}
