package ru.kalmychkov;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Hello, world.
 * @author Алексей Калмычков
 * @since 04.12.2016
 * @version 1.0
 */
public class CalculateTest {
	/**
     * whenAddOneToOneThenTwo - test Hello, world.
     */
	@Test
    public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello, world!\r\n"));
	}
}