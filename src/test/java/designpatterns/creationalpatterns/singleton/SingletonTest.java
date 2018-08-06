package designpatterns.creationalpatterns.singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        Singleton expResult = Singleton.getInstance();
        Singleton result = Singleton.getInstance();
        assertEquals(expResult, result);
    }

}
