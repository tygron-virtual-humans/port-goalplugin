package plugin.operations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MinTest {

    @Test(expected = ArithmeticException.class)
    public void testCalcWithEmptyList() {
        Min op = new Min();
        op.calc(new ArrayList<Double>());
    }

}