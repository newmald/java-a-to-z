package ru.kalmychkov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
	@Test
	public void whenIsTriangleThenIsArea() {
		Point a = new Point(0D, 0D);
		Point b = new Point(1D, 2D);
		Point c = new Point(3D, 4D);
		Triangle triangle = new Triangle(a,b,c);
		double s = triangle.area();
		assertThat(s, is(0.9999999999999988));
	}

	@Test
	public void wthenSideTriangleThenMaxSide() {
		Point a = new Point(0D, 0D);
		Point b = new Point(1D, 2D);
		Point c = new Point(3D, 4D);
		Triangle triangle = new Triangle(a,b,c);
		double maxSide = triangle.max();
		assertThat(maxSide, is(5.0));
	}
}