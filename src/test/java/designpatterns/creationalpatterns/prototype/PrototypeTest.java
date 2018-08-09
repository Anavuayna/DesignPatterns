package designpatterns.creationalpatterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrototypeTest {

    @Test
    public void testClone() {
        Prototype prototype = new ConcretePrototype();
        assertEquals(prototype.value, 32767);
        try {
            Prototype copy = prototype.clone();
            assertEquals(copy.value, 32767);
            Assert.assertNotEquals(prototype, copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
