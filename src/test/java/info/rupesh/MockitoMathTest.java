package info.rupesh;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class MockitoMathTest {

        @Mock
        Math getMockedMathObject;

        @Before
        public void setUp(){
            initMocks(this);
            when(getMockedMathObject.add(0, 4)).thenReturn(7);
            when(getMockedMathObject.multiply(7,3)).thenReturn(21);
        }

        @After
        public void tearDown(){
            getMockedMathObject = null;
        }

        @Test
        public void testAddWithMockedObject() throws Exception {
            assertEquals(7, getMockedMathObject.add(0, 4));
        }

        @Test
        public void testMultiplyWithMockedObject() throws Exception {
            assertEquals(21, getMockedMathObject.multiply(7, 3));
        }
    }


