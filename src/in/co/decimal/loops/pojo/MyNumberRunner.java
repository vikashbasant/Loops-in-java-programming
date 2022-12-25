package in.co.decimal.loops.pojo;

public class MyNumberRunner {
	public static void main(String[] args) {
		MyNumber number = new MyNumber(10);

		number.isPrime();

		int sum = number.sumUptoN();
		System.out.println(sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);

		number.printANumberTriangle();

	}
}
