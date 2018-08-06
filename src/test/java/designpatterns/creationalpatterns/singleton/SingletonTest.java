package designpatterns.creationalpatterns.singleton;

import static org.junit.Assert.*;

public class SingletonTest {

    @org.junit.Test
    public void testGetInstance() {
        Singleton expResult = Singleton.getInstance();
        Singleton result = Singleton.getInstance();
        assertEquals(expResult, result);
    }

}
