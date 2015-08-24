package info.rupesh;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    Math simpleMathObject;

    @Before
    public void setUp(){
        simpleMathObject = new Math();
    }

    @After
    public void tearDown(){
        simpleMathObject= null;
    }

    @Test
    public void testAddWithRealObject() throws Exception {
        simpleMathObject.add(3, 4);
        assertEquals(7, simpleMathObject.add(3, 4));
    }

}
