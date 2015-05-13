package plugin.operations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test(expected = ArithmeticException.class)
    public void testCalcWithEmptyList() {
        Division op = new Division();
        op.calc(new ArrayList<Double>());
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcWithSecondZero() {
        Division op = new Division();
        op.calc(new ArrayList<Double>(){{ add(1.d);  add(0.d); }});
    }
}