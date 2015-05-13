package plugin.operations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test(expected = ArithmeticException.class)
    public void testCalcWithEmptyList() {
        Multiply op = new Multiply();
        op.calc(new ArrayList<Double>());
    }

}