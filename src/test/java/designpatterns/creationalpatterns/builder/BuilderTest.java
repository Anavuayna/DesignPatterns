package designpatterns.creationalpatterns.builder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testBuilderA() {
        Director director = new Director();
        director.setBuilder(new ConcreteABuilder());
        director.constractProduct();
        Product result = director.getProduct();
        assertEquals(result.getId(), 1);
        assertEquals(result.getName(), "ProductA");
    }

    @Test
    public void testBuilderB() {
        Director director = new Director();
        director.setBuilder(new ConcreteBBuilder());
        director.constractProduct();
        Product result = director.getProduct();
        assertEquals(result.getId(), 2);
        assertEquals(result.getName(), "ProductB");
    }

}
