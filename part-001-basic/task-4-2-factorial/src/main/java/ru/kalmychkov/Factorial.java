package ru.kalmychkov;

public class Factorial {
	int x;

	public Factorial(int x) {
		this.x = x;
	}

	public int calculate() {
		int factorial = 1;
		if (x > 0 || x != 0){
			for(int number = 2; number <= x; ++number) {
				factorial *= number;
			}
		} else 
			System.out.println("Factorial must be greater than 0");
		return factorial;
	}
}