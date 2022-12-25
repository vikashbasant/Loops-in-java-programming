package in.co.decimal.loops.pojo;

import java.util.Scanner;

public class DoWhileRepeat {

	private int number;

	public DoWhileRepeat() {
		// default constructor:
	}

	public DoWhileRepeat(int number) {
		this.number = number;
	}

	public void printCuble() {
		do {
			System.out.println("Cube is " + this.number * this.number * this.number);
			System.out.println("Eneter a number: ");
			Scanner scan = new Scanner(System.in);
			this.number = scan.nextInt();
		} while (this.number > 0);
		System.out.println("Thank You! Have Fun!");

	}
}
