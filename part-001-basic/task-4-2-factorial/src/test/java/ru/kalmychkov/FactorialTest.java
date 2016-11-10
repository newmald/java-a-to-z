package ru.kalmychkov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenNumberXThenFactorial() {
        Factorial factorial = new Factorial(10);
        int result = factorial.calculate();
        assertThat(result, is(3628800));
    }
}