package ru.kalmychkov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	@Test
	public void whenAddTwoNumbersThenResultAdd(){
		Calculator calc = new Calculator();
		calc.add(4, 4);
		double result = calc.getResult();
		assertThat(result, is(8d));
	}
	
	@Test
	public void whenSubtractionTwoNumbersThenResultSubtraction(){
		Calculator calc = new Calculator();
		calc.subtraction(4, 4);
		double result = calc.getResult();
		assertThat(result, is(0d));
	}
	
	@Test
	public void whenMultipleTwoNumbersThenResultMultiple(){
		Calculator calc = new Calculator();
		calc.multiple(4, 4);
		double result = calc.getResult();
		assertThat(result, is(16d));
	}
	
	@Test
	public void whenDivTwoNumbersThenResultDiv(){
		Calculator calc = new Calculator();
		calc.div(4, 4);
		double result = calc.getResult();
		assertThat(result, is(1d));
	}
}