package ru.kalmychkov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {
	@Test
	public void whenEquationThreeNumbersThenSquare() {
		Square square = new Square(1,2,3);
		float result = square.calculate(2);
		assertThat(result, is(11.0F));
		System.out.println(result);
	}
}