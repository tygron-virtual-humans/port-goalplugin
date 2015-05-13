package plugin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OperationTest {

    public Operation operation;

    @Before
    public void setUp() throws Exception {
        operation = new Operation() {
            @Override
            public double calc(List<Double> vars) {
                return 0;
            }
        };
    }

    @Test
    public void testGetStringConstruct() throws Exception {
        assertNull(operation.getString());
    }

    @Test
    public void testGetStringAfterSet() throws Exception {
        operation.setString("plus");
        assertEquals("plus", operation.getString());
    }

    @Test
    public void testCalc() throws Exception {
        assertEquals(0.f, operation.calc(new ArrayList<Double>()), 0.1f);
    }
}