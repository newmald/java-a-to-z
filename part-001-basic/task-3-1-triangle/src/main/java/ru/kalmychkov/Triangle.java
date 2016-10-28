package ru.kalmychkov;

public class Triangle {
	public Point a;
	public Point b;
	public Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double ab = this.a.distanceTo(this.b);
		double bc = this.b.distanceTo(this.c);
		double ac = this.a.distanceTo(this.c);
		if ((ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc)) {
			double halfPerimeter = ((ab + bc + ac) / 2);
			double areaTriangle = Math.sqrt(halfPerimeter*(halfPerimeter - ab)*(halfPerimeter - bc)*(halfPerimeter - ac));
			return areaTriangle;
		} else {
			System.out.println("Error! To build the impossible triangle!");
		}
		return -1;
	}

	public double max() {
		double ab = this.a.distanceTo(this.b);
		double bc = this.b.distanceTo(this.c);
		double ac = this.a.distanceTo(this.c);
		return Math.max(ab, Math.max(bc, ac));
	}
}