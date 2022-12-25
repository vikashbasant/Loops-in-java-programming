package in.co.decimal.loops.pojo;

public class MyNumber {
	private int number;

	public MyNumber() {
		// default constructor:
	}

	public MyNumber(int number) {
		this.number = number;
	}

	public void isPrime() {
		// Boundary Condition:
		if (this.number < 2) {
			System.out.println("Not prime");
			return;
		}
		int div = 2;
		for (; div < this.number; div++) {
			if (this.number % div == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("prime");
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= this.number; i++) {
			sum += i;
		}
		return sum;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= this.number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public int sumOfDivisors() {
		int sumOfDivisor = 0;
		for (int i = 2; i <= (this.number / 2); i++) {
			if (this.number % i == 0) {
				sumOfDivisor += i;
			}
		}
		return sumOfDivisor;
	}

}
