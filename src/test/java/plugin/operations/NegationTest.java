package plugin.operations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NegationTest {

    @Test(expected = ArithmeticException.class)
    public void testCalcWithEmptyList() {
        Negation op = new Negation();
        op.calc(new ArrayList<Double>());
    }

}