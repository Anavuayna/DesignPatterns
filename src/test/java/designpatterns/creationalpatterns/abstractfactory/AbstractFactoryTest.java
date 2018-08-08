package designpatterns.creationalpatterns.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class AbstractFactoryTest {

    @Test
    public void testFactoryA() {
        AbstractFactory factory = FactoryProducer.getFactory("A");

        ProductA productA1 = factory.getProductA("A1");
        assertTrue(productA1 instanceof ConcreteProductA1);

        ProductA productA2 = factory.getProductA("A2");
        assertTrue(productA2 instanceof ConcreteProductA2);

        ProductB productB1 = factory.getProductB("B1");
        assertNull(productB1);

        ProductB productB2 = factory.getProductB("B2");
        assertNull(productB2);
    }

    @Test
    public void testFactoryB() {
        AbstractFactory factory = FactoryProducer.getFactory("B");

        ProductB productB1 = factory.getProductB("B1");
        assertTrue(productB1 instanceof ConcreteProductB1);

        ProductB productB2 = factory.getProductB("B2");
        assertTrue(productB2 instanceof ConcreteProductB2);

        ProductA productA1 = factory.getProductA("A1");
        assertNull(productA1);

        ProductA productA2 = factory.getProductA("A2");
        assertNull(productA2);
    }

}
