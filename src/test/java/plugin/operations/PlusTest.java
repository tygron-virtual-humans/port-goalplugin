package plugin.operations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlusTest {

    @Test(expected=ArithmeticException.class)
    public void testCalc() throws Exception {
        Plus op = new Plus();
        op.calc(new ArrayList<Double>(){{ add(1.d); }});
    }

}